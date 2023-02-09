package com.cogent.LoopBreaker;

public class LoopBreaker {
	void runCode() {
	for (int i = 1; i <= 10; i = i + 1) {
		if (i == 5) {
			continue;
		}
		System.out.println("Hello " + i);
	}
	
	System.out.println("Loop Over");
}
}