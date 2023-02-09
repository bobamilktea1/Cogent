package com.cogent.ReturnType;

public class MotorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor motor = new Motor();
		System.out.println(motor.speed(2));
		System.out.println(motor.speed(3));
		System.out.println(motor.speed(4));
		int result = motor.speed(5);
		System.out.println(result);
	}

}
