package com.hackerrank.days30ofcode.complements;

abstract class Book {
	String title;
	String author;
	Book(String t, String a) {
		title = t;
		author = a;
	}

	abstract void display();

}
