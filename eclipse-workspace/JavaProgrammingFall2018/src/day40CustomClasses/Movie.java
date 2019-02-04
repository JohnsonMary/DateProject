package day40CustomClasses;

public class Movie {
	
	String name;
	int length;
	

	public void watch() {
		
		System.out.println("Watching Movie: "+name);
		System.out.println("It is "+length+" minutes.");
		
	}
	public void buy(double price) {
		
	    System.out.println("The price of the movie "+name+" is $"+price);
		
		
    }
	public void sell(double price) {
		
		System.out.println("I'm selling the movie "+name+" for $"+price);
	}
	
}
