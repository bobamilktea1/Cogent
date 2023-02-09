package com.cogent.bankTask;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankApp bankApp = new BankApp();
				//object reference -- point to some Address ---> Object
		bankApp.depositAmt(1000);
		bankApp.withdrawAmt(500);
		bankApp.showBalance();
	}

}
