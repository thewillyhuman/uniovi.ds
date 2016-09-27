package io.guill.uniovi.ds.practica_3.editor;

public class Coordinate {
	
	private int x,y;
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setCoordinate(Coordinate c) {
		this.x = c.getX();
		this.y = c.getY();
	}
	
	public void setCoordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Coordinate c) {
		if(c.getX() == this.x && c.getY() == this.y)
			return true;
		return false;
	}

}
