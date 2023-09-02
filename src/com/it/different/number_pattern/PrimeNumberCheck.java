package com.it.different.number_pattern;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("Enter a number: ");
		num = sc.nextInt();

		int checkPrime = 0;

		for (int i = 2; i < num/2; i++) {
			if (num % i == 0) {
				checkPrime++;
				break;
			}
		}

		if (checkPrime == 0) {
			System.out.println(num + " is prime Number.");
		} else {
			System.out.println(num + " is not prime number.");
		}

		sc.close();

	}
}
