package com.cogent.basics;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Arithmetic
		int a = 1, b = 2;
		int c = a + b;
		System.out.println(a + b);
		
		// Relational operator: > (greater than)
	    boolean d = a > b;
	    System.out.println("a > b = " + d);

	    // Logical operator: && (and)
	    boolean e = d && (c > 0);
	    System.out.println("d && (c > 0) = " + e);

	    // Bitwise operator: & (and)
	    int f = a & b;
	    System.out.println("a & b = " + f);

	    // Assignment operator: =
	    c = f;
	    System.out.println("c = f = " + c);

	    // Ternary operator: ?:
	    int g = (c > 0) ? a : b;
	    System.out.println("(c > 0) ? a : b = " + g);

	    // Unary operator: ++ (increment)
	    int h = 10;
	    h++;
	    System.out.println("h++ = " + h);

	    // Type operator: instanceof
	    String i = "Hello";
	    boolean j = i instanceof String;
	    System.out.println("i instanceof String = " + j);
	  }
	
	}


