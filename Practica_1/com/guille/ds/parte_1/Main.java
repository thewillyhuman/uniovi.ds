package com.guille.ds.parte_1;

public class Main {

	public static void main(String[] args) {
		double[] temperaturas = new double[100];

		// Toma de datos
		for (int i = 0; i < temperaturas.length; i++)
			temperaturas[i] = leeSensorCelsius();

		// C�lculo con los datos en Celsius
		double mediaCelsius = 0;
		for (int i = 0; i < temperaturas.length; i++)
			mediaCelsius += temperaturas[i];
		mediaCelsius = mediaCelsius / temperaturas.length;
		System.out.println(mediaCelsius);

		// C�lculo con los datos en Fahrenheit
		double mediaFahrenheit = 0;
		for (int i = 0; i < temperaturas.length; i++)
			mediaFahrenheit += temperaturas[i] * 1.8 + 32;
		mediaFahrenheit = mediaFahrenheit / temperaturas.length;
		System.out.println(mediaFahrenheit);

		// Otro c�lculo con los datos en Fahrenheit
		double varianza = 0;
		for (int i = 0; i < temperaturas.length; i++)
			varianza += Math.pow((temperaturas[i] * 1.8 + 32) - mediaFahrenheit, 2);
		varianza = varianza / temperaturas.length;
		System.out.println(varianza);
	}

	public static double leeSensorCelsius() {
		return Math.random() * 30;
	}
}
