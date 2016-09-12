package com.guille.ds.parte_2;

// Pel�cula

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int NEW_RELEASE = 1;
	public static final int REGULAR = 0;

	private String title;
	private int category;

	public Movie(String title, int category) {
		this.title = title;
		this.category = category;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}
}
