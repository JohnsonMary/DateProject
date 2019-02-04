package day43_Static_Constructor02;

public class AtRestaurant {
	public static void main(String[] args) {
		
		Dinner dad= new Dinner();
		Dinner mom=new Dinner();
		Dinner kid=new Dinner();
		
		System.out.println("Pizza slices: "+dad.pizzaSlices);
		dad.takeASlice(2);
		mom.takeASlice(3);
		kid.takeASlice();
		System.out.println(dad.pizzaSlices);


		System.out.println(mom.pizzaSlices);
		
		
		
		
		
		
	}

}
