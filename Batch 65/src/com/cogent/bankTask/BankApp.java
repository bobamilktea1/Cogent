package com.cogent.bankTask;

public class BankApp {
	int balance = 0;
	
	void withdrawAmt (int amount) {
		if(balance >= amount) {
			balance -= amount;
		System.out.println("Withdraw Amount: " + amount);	
		System.out.println("Remaining Balance: " + balance);
	} else {
		System.out.println("Insufficient balance!");
	}
	}
	void depositAmt(int amount) {
		balance += amount;
		System.out.println("Deposit Amount: " + amount);
		System.out.println("Updated Balance: " + balance);
	}
	
	void showBalance() {
		System.out.println("Display Balance: " + balance);
	}
}
