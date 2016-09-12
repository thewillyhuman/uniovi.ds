package com.guille.ds.parte_2;

// Alquiler

public class Rental 
{
	private Movie movie;
	private int days;
	
	public Rental(Movie movie, int days) 
	{
		this.movie = movie;
		this.days = days;
	}

	public int getDays() 
	{
		return days;
	}

	public Movie getMovie() 
	{
		return movie;
	}
}
