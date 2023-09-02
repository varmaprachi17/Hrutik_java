package com.it.different.number_pattern;

import java.util.Scanner;

public class ArmstronNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number;
		System.out.println("enter a number:");
		number = sc.nextInt();

		int copyNum = number;

		int rem = 0;
		int newNum = 0;

		while (number > 0) {
			rem = number % 10;
			newNum = newNum + (rem * rem * rem);
			number = number / 10;
		}

	//	System.out.println(newNum);
		
		if(newNum==copyNum) {
			System.out.println(copyNum + " is armstrong number");
		}else {
			System.out.println(copyNum + " is not armstrong number");
		}
	}
}
