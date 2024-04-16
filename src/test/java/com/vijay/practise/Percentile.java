package com.vijay.practise;

import org.testng.annotations.Test;

public class Percentile {

	@Test
	public void Percentile_practice() {

		int n = 50;

		if (n > 0) {

			System.out.println("n is positive");
		} else {
			System.out.println("n is Negative");
		}

	}

	@Test
	public void Longestnumber() {

		int n1 = 8;
		int n2 = 9;
		int n3 = 5;

		if (n1 >= n2 && n1 >= n3) {

			System.out.println("The Longest number is n1" + n1);

		} else if (n2 >= n1 && n2 >= n3) {

			System.out.println(" The Longest number is n2" + n2);
		} else {

			System.out.println("The LONgest number is n3" + n3);
		}
	}
	
	@Test

	public void Nestedif_Example() {

		int x = 10;
		int y = 10;

		if (x > y) {

			System.out.println("x is greater than y");

		} else {
			if (x < y) {

				System.out.println(" X is less than y ");

			} else {

				System.out.println(" X is equal to y");
			}
		}

	}

}
