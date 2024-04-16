package com.vijay.practise;

import org.testng.annotations.Test;

public class Switchexample {
	
	@Test
	public void switchexample_practice() {

        String Vegitable = "Onion"; 
        
        switch (Vegitable) {
            case "mango":
                System.out.println("Not available");
                break;
            case "pototao":
                System.out.println("Small");
                break;
            case "Tomoto":
                System.out.println("Available");
                break;
            case "Onion":
                System.out.println("Large");
                break;
            case "Mirchi":
                System.out.println("Extra Large");
                break;
            default:
                System.out.println("Invalid size number");
        }
    }

	@Test
	public void switchexample_practice2() {
		
		int day = 6;
		String daystring;
		
		switch (day) {
		
		case 1:
			daystring = "Monday";
            break;
        case 2:
        	daystring = "Tuesday";
            break;
        case 3:
            daystring = "Wednesday";
            break;
        case 4:
            daystring = "Thursday";
            break;
        case 5:
            daystring = "Friday";
            break;
        default:
        	daystring = "Invalid";
        	
    }
		System.out.println(daystring);
		}
	}
		
