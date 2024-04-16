package com.vijay.practise;

import org.testng.annotations.Test;

public class Addition {

	private int a;
	int b;

	@Test
	public void adition_Program() {

		a = 10;
		b = 20;
		int c = a + b;
		System.out.println("the value of C ..." + c);
		c = a - b;
		System.out.println("the value of C ..." + c);

	}

}
