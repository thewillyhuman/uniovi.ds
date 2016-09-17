package io.guill.uniovi.ds.practica_1.parte_1.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import io.guill.uniovi.ds.practica_1.parte_1.Temperatura;

/**
 * Tests the temperature class in order to ensure the correct result of the
 * transactions between methods and the change between units.
 * 
 * @version 1.0
 * @author Guillermo Facundo Colunga
 * @repo https://github.com/ZenMaster91/uniovi.ds
 */
public class TemperaturaTest {

	Temperatura t1, t2, t3;

	private static final double DELTA = 1e-15;

	@Before
	public void setUp() {
		t1 = new Temperatura(10);
		t2 = new Temperatura(100);
		t3 = new Temperatura(1);
	}

	@Test
	public void getCelsiulTest() {
		// Checking some pre-established values.
		assertEquals(10, t1.getCelsius(), DELTA);
		assertEquals(100, t2.getCelsius(), DELTA);
	}

	@Test
	public void setCelsiusTest() {
		// Checking the current status of the t3.
		assertEquals(1, t3.getCelsius(), DELTA);

		// Changing the status of t3 to -1 degrees.
		t3.setCelsius(-1);

		// Checking that the status has change from the previous one.
		assertNotEquals(1, t3.getCelsius(), DELTA);

		// Checking it has change for the correct one.
		assertEquals(-1, t3.getCelsius(), DELTA);

		// Testing the same but with float.
		t3.setCelsius(-1.5);

		// Checking that the status has change from the previous one.
		assertNotEquals(-1, t3.getCelsius(), DELTA);

		// Checking it has change for the correct one.
		assertEquals(-1.5, t3.getCelsius(), DELTA);
	}

	@Test
	public void getFarenheitTest() {
		// Checking some pre-established values.
		assertEquals(50.0, t1.getFarenheit(), DELTA);
		assertEquals(212.0, t2.getFarenheit(), DELTA);
	}

	@Test
	public void setFarenheitTest() {
		// Checking the current status of the t3.
		assertEquals(1, t3.getCelsius(), DELTA);

		// Changing the status of t3 in Farenheit.
		t3.setFarenheit(50.0);
		// Checking that the status has change from the previous one.
		assertNotEquals(1, t3.getCelsius(), DELTA);

		// Checking it has change for the correct one.
		assertEquals(10, t3.getCelsius(), DELTA);
		assertEquals(50, t3.getFarenheit(), DELTA);

	}
}
