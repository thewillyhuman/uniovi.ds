package io.guill.uniovi.ds.practica1.part1;

public class Temperature {

	/**
	 * Temperature object storing the celsius. farenheit it in both units.
	 * 
	 * @version 201709140927
	 * @author Guillermo Facundo Colunga
	 */

	private double celsius;

	/**
	 * 
	 * @param celsius the initial temperature in celsius.
	 */
	public Temperature(double celsius) {
		setCelsius(celsius);
	}

	/**
	 * Devuelve el valor de la temperatura en celsius.
	 * 
	 * @return el valor de la temperatura en celsius.
	 */
	public double asCelsius() {
		return this.celsius;
	}

	/**
	 * Cambia el valor de la temperatura en celsius.
	 * 
	 * @param celsius son los nuevos grados a establecer como temperatura.
	 */
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	/**
	 * Devuelve el valor de la temperatura en farenheit.
	 * 
	 * @return el valor de la temperatura en farenheit.
	 */
	public double asFarenheit() {
		return (this.celsius * 9 / 5) + 32;
	}

	/**
	 * Cambia el valor de la temperatura a farenheit.
	 * 
	 * @param farenheit son los grados a establecer como temperatura.
	 */
	public void setFarenheit(double farenheit) {
		this.celsius = (farenheit - 32) * 5 / 9;
	}
}
