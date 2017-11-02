package io.guill.uniovi.ds.practica6.test;

import static org.junit.Assert.*;

import org.junit.Test;

import io.guill.uniovi.ds.practica6.MapKit.MKDirectionsRequest;
import io.guill.uniovi.ds.practica6.components.GPS;

public class MKDirectionsRequestTest {

	private GPS gps = new GPS();
	
	
	@Test
	public void test() {
		
		long aa = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++) {
			new MKDirectionsRequest().navigate("");
		}
		long ab = System.currentTimeMillis();
		
		long timeForMK = ab-aa;
		
		long ba = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++) {
			gps.navigate("");
		}
		long bb = System.currentTimeMillis();
		
		long timeForGPS = bb-ba;
		
		System.out.print(timeForMK + " " + timeForGPS);
		
		assertTrue(timeForGPS+(timeForGPS*0.1)>=timeForMK);
	}

}
