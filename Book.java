package com.constructor;

public class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void display() {
		System.out.println("Title of the Book : " + title);
		System.out.println("Author of the Book : " + author);
	}
	public static void main(String [] args) {
		Book book = new Book("Engineering Mechanics", "R.S Kurmi");
		book.display();
	}
}
