package com.cogent.ReturnType;

public class Motor {
	int motorspeed = 10;
	int speed(int accelerator) {  //5 or beyond
		//process
		motorspeed = motorspeed * accelerator;
		if(accelerator < 5) {
			
		
		System.out.println("safe speed ");
		} else {
			System.out.println("not safe speed");
		}
		return motorspeed;
	}

}
