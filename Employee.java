package com.constructor;

public class Employee {
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		this.name=name;
		this.salary=salary;
	
	if (salary < 0) {
		salary = 0;
	}
	}
	
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee("Ranga",30000.0);
		employee.displayDetails();
	}
	
}
