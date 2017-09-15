package io.guill.uniovi.ds.practica1.part2;

/*
 * The MIT License (MIT)
 * Copyright (c) 2016 Mike Taghavi (mitghi[at]me.com)
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */


/**
 * Rental.java
 *
 * @author willy
 * @version 201709151437
 * @since 15/09/2017
 * @formatter Oviedo Computing Community
 */
public class Rental {

	private Movie movie;
	private int days;

	public Rental(Movie movie, int days) {
		this.movie = movie;
		this.days = days;
	}

	/**
	 * Gets the number of days to rent a film.
	 * 
	 * @return the number of days of the rental.
	 */
	public int getDays() {
		return this.days;
	}

	/**
	 * Gets the movie of the rental.
	 * 
	 * @return the movie of the rental.
	 */
	public Movie getMovie() {
		return this.movie;
	}

	/**
	 * Gets the number of points achieved with the rental.
	 * 
	 * @return the number of point given with the rental.
	 */
	public int getPoints() {
		return this.movie.getPoints(days);
	}

	/**
	 * Gets the total price of the rental.
	 * 
	 * @return the price of the rental.
	 */
	public double getPrice() {
		return this.movie.getPrice(days);
	}
}
