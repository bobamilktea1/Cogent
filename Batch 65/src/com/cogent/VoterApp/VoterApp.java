package com.cogent.VoterApp;

public class VoterApp {
	void checkAvailability(int age) {
		if (age < 18) {
			System.out.println(age + " is not the age to vote");
		} else
			System.out.println(age + " is the age to vote");
	}

}
