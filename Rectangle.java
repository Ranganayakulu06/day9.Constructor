package com.constructor;

public class Rectangle {
	private int length;
	private int breadth;
	
	public Rectangle() {
	this.length=1;
	this.breadth=1;
	}
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public int area() {
		return length * breadth;
	}
	
	public static void main(String [] args) {
		Rectangle defaultRectangle = new Rectangle();
		System.out.println("Area (Default):" + defaultRectangle.area());
		
		Rectangle customRectangle = new Rectangle(5 , 10);
		System.out.println("Area (Custom):" + customRectangle.area());
		
	}
}