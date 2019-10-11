package com.test;

public class HackerrankTest2 {

	private int currentX;
	private int currentY;
	private int previousX =0;
	
	String lastmove = "";
	public int getCurrentX() {
		return currentX;
	}

	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}

	public int getCurrentY() {
		return currentY;
	}

	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}

	public int getPreviousX() {
		return previousX;
	}

	public void setPreviousX(int previousX) {
		this.previousX = previousX;
	}

	public int getPreviousY() {
		return previousY;
	}

	public void setPreviousY(int previousY) {
		this.previousY = previousY;
	}

	private int previousY = 0;	
	
	public HackerrankTest2() {
		this.currentX = 0;
		this.currentY =5;
	}
	
	public HackerrankTest2(int currentX ,int currentY) {
		super();
		this.currentX = currentX;
		this.currentY = currentY;
	}
	
	public void moveX(int dx) {
		this.setPreviousX(this.currentX);
		this.setCurrentX( this.currentX + dx);
		lastmove = "x "+dx;
		
		this.setPreviousY(this.currentY);
	}
	
	public void moveY(int dy) {
		this.setPreviousY(this.currentY);
		this.setCurrentY(this.currentY + dy);
		lastmove = "y "+dy;
		
		this.setPreviousX(this.currentX);
	}
	
	public void printCurrentCoordinates() {
			System.out.println(this.currentX+ " "+ this.currentY);
	}

	public void printLastCoordinates() {
		System.out.println(this.previousX+ " "+ this.previousY);
	}
	
	public void printLastMove() {
		System.out.println(lastmove);
	}

}
