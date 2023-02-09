package com.cogent.libraryTask;

public class Library {
int balance = 0;
	
	void bookSold (int amount) {
		if(balance >= amount) {
			balance -= amount;
		System.out.println("Sold books are: " + amount);	
		System.out.println("Remaining books: " + balance);
	} else {
		System.out.println("No enough books!");
	}
	}
	void addBook(int amount) {
		balance += amount;
		System.out.println("Added books are : " + amount);
	}
	
	void bookAvailable() {
		System.out.println("Display available books: " + balance);
	}
}


