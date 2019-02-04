package day30_Methods01;

public class Cooking {
	
	public static void main(String[] args) {
	
		cook("Steak");
		youWillNeed("Some butter, tomatoes, meat, salt, black pepper, onions, garlic");
		cookFor(40,"grilling");
		ready();
		
		
		
	}

	
	public static void cook(String foodName) {
		
		System.out.println("Today we are cooking "+foodName+".");
		
	}
	public static void youWillNeed(String items) {
		
		System.out.println("We need following items: "+items+".");
		
	}
	
	public static void cookFor(int minutes, String  wayOfCooking) {
		
		System.out.println("You need to cook for "+minutes+ " min. by "+ wayOfCooking+".");
	
	}
	
	public static void ready() {
		
		System.out.println("Meal is ready!Enjoy!");
	}
}
