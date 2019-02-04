package day31_MethodsWithReturn;
import java.util.*;


public class Weekdays {
	public static void main(String[] args) {
		
		boolean valid=isValidDay("Monday");
		System.out.println(valid);
		
		valid=isValidDay("funday");
		System.out.println(valid);
		
		
		
		
	}

	public static boolean isValidDay (String weekdayName){
		
		
	
		
		switch (weekdayName) {
		case "sunday":
			return true;
		case "monday":
			return true;
		case "tuesday":
			return true;
		case "wednesday":
			return true;
		case "thursday":
			return true;
		case "friday":
			return true;
		case "saturday":
			return true;
		default:
			System.out.println("Invalid day");
			
			
		
		
		}
		return false;
			
	

		}	
}
		
		
