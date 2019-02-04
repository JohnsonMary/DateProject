package day43_Static_Constructor02;

public class Dinner {
	
	public  static int pizzaSlices = 8;
	
	
	public void takeASlice () {
		
		pizzaSlices--;
		
	}
	public void takeASlice(int num) {
		
		pizzaSlices-=num;
	}

}
