package com.cogent.libraryTask;


public class LibraryTester {
	

public static void main(String[] args) {
	Library lib = new Library();
	//object reference -- point to some Address ---> Object
	lib.addBook(100);
	lib.bookSold(50);
	lib.bookAvailable();
	lib.bookSold(50);

}
}