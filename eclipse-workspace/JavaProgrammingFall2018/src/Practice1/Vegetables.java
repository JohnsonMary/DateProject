package Practice1;

public class Vegetables {
	public static void main(String[] args) {
		int apples=5;
		apples+=10;
		System.out.println(apples);
		
		int carsInLot=23;
		carsInLot-=10;
		System.out.println(carsInLot);
		
		int pizzaSlices=32;
		pizzaSlices/=5;
	    pizzaSlices%=5;
		System.out.println(pizzaSlices);
		
		int minutes=100;
		int hours=minutes/60;
		minutes%=60;
		
		System.out.println("100 minutes is "+hours+" hour and "+minutes+" minutes.");
		
		
		
	}

}
