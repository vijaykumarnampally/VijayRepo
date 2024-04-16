package com.vijay.practise;

import org.testng.annotations.Test;

public class Nestedif {
	
	@Test
	
	public void nestedif_practice() {
		
		int T = 90;
		int H = 80;
		int E = 100;
		
		if (T+H+E > 260) {
			
			System.out.println("The student is passed");
		}
		
		else {
			
			if (T+H+E < 260) {
				
				System.out.println("The Student is Failed");
			}
			else {
				System.out.println("The student is Neutral");
			}
		}
	}

}
