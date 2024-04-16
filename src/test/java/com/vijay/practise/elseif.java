package com.vijay.practise;

import org.testng.annotations.Test;

public class elseif {
	
	@Test
	
	public void elseif_practice() {
		
		int time1 = 22;
		int time2 = 22;
	    
		if (time1 > time2 ) {
			
			System.out.println("Good Afternoon");
		}
		else if (time1 < time2 ){
			
			System.out.println("Good Morning");
		}
		else if (time2 == time1 ) {
			
			System.out.println("Good Evening");
		}
		else {
			
			System.out.println("Good night");
		}
	
	}
	
	@Test
	
	public void elseif_practice2() {
		
		int vijay = 40;
		int shiva = 70;
		int srinu = 50;
		
		if (vijay > shiva && vijay > srinu) {
			
			System.out.println("vijay got First in class");
		}
		else if (vijay > shiva && vijay < srinu){
			
			System.out.println("Vijay got second in class");
		}
		else if (vijay < shiva && vijay > srinu) {
			
			System.out.println("vijay got second in class");
		}
		else if (vijay < shiva && vijay < srinu ) {
			
			System.out.println(" vijay got Third in class");
		}
		else {
			System.out.println(" vijay got failed in class");
		}
	}

}
