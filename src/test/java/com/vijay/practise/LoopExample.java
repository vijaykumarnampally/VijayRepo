package com.vijay.practise;

import org.testng.annotations.Test;

public class LoopExample {

	@Test
	public void loopexampletest() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");

		}
	}

	@Test

	public void Loopexample_practice2() {

		int i, j, row = 6;

		for (i = 0; i <= row; i++) {

			for (j = 2 * (row - i); j >= 0; j--) {

				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println("");
		}
	}

	@Test

	public void Loopexample_practice3() {

		int i, j, k, row = 8;

		for (i = 0; i <= row - 1; i++) {

			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (k = i; k <= row - 1; k++) {

				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		for (i = 1; i <= row - 1; i++) {

			for (j = 1; j < row - i; j++) {

				System.out.print(" ");
			}
			for (k = 0; k <= i; k++) {

				System.out.print("*" + " ");
			}

			System.out.println("");
		}
	}

	@Test

	public void Loopexample_practice4() {

		int i, j, k, row = 8;

		for (i = 0; i <= row - 1; i++) {

			for (j = 0; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for (i = 0; i < row + 1; i++) {

			for (j = 0; j <= i; j++) {

				System.out.print(" ");
			}
			for (k = 0; k <= row - i; k++) {

				System.out.print("*");
			}

			System.out.println("");
		}

	}
	
	@Test
	
	public void Loopexample_practice5() {
		
		int i, j, k, row = 5;
		
        for (i=0; i<=row-1; i++) {
			
			System.out.print("* ");
		}
		
		for (i=0; i<=row-1 ; i++) {
			
		    System.out.println("*");
		}
             for (i=0; i<=row-1; i++)	{
			
			System.out.print("* ");
		}
					
	}
	
}


