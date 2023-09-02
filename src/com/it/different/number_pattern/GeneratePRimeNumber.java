package com.it.different.number_pattern;

import java.util.Scanner;

public class GeneratePRimeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// for loop to generate number
		for (int i = 1; i <= 100; i++) {
			int checkPrime = 0;
			if (i > 1) {
				for (int j = 2; j <= i / 2; j++) {

					if (i % j == 0) {
						checkPrime++;
						break;
					}

				}

				if (checkPrime == 0) {
					System.out.println(i);
				}
			}
		}

		sc.close();
	}
}
