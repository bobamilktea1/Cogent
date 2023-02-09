package com.cogent.loop;

public class CanteenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canteen canteen = new Canteen();
		for (int i = 1; i <= 10; i++) {
		//rule	but 5 time you can't take more
			if (i <=5) {
				System.out.println("food has been taken: " + i);
				
			
			canteen.needMoreFood();
		}
		}
		
	}

}
