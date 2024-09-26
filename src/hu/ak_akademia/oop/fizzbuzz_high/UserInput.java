package hu.ak_akademia.oop.fizzbuzz_high;

import java.util.Scanner;

class UserInput {
	private static final int LOW_BOUND = 50;
	private static final int HIGH_BOUND = 1000;

	int askInput() {
		int input = 0;
		try (var scn = new Scanner(System.in)) {
			System.out.printf("Enter the upper bound value (%d ≤ N ≤ %d)!%n", LOW_BOUND, HIGH_BOUND);
			while (input < LOW_BOUND || input > HIGH_BOUND) {
				try {
					System.out.print("N = ");
					input = Integer.parseInt(scn.nextLine());
				} catch (NumberFormatException nfe) {
				}
			}
			return input;
		}
	}
}
