package com.it.different.number_pattern;

import java.util.Scanner;

//program to reverse given number
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("Enter a numebr:");
		num = sc.nextInt();

		int newNum = 0;
		int remainder = 0;

		while (num > 0) {
			remainder = num % 10;
			newNum = (newNum * 10) + (remainder);
			num = num / 10;

		}

		System.out.println("My reverse number is " + newNum);

		sc.close();
	}
}
