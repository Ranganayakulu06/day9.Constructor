package com.constructor;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public static void main(String [] args) {
		
		Circle circle = new Circle(8.0);
		
		System.out.println("Radius of Circle: " + circle.radius );
		System.out.println("Area of Circle: " + circle.getArea());
		System.out.println("Circumference of Circle: " + circle.getCircumference());
	}
	
	
}
