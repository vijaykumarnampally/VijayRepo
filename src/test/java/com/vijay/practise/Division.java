package com.vijay.practise;

import org.testng.annotations.Test;

public class Division {

	@Test

	public void Division_practice() {

		int a = 100;
		int b = 50;
		int c = a + b;
		if (a < b) {
			System.out.println("a is lessthan b");
		} else {
			System.out.println("a is graterthan b");
		}

	}
	
	@Test
   public void percentile () {
	   
	   int a = 1001;
	   int b = 100;
	   int c = a%b ;
	   
	   System.out.println("The percentage value of c is " + c);
	   
   }
}
