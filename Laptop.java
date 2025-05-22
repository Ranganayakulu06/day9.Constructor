package com.constructor;

import java.util.Scanner;

public class Laptop {
	private String brand;
	private int ramSize;
	
	public Laptop(String brand, int ramSize) {
		this.brand=brand;
		this.ramSize=ramSize;
	}
	public void showSpecs() {
		System.out.println("Laptop brand: " + brand);
		System.out.println("Laptop ramSize: " + ramSize);
		System.out.println();
		
	}
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Laptop Brand:");
		
		String userBrand = sc.nextLine();
		System.out.println("Enter Laptop RamSize:");
		
		int userRam = sc.nextInt();
		System.out.println("---------------------");
		Laptop f2=new Laptop("hp",124);
		f2.showSpecs();
		
		
	
		
		
}
}