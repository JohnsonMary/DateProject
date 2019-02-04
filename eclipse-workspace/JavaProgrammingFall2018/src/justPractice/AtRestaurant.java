package justPractice;

public class AtRestaurant {
	public static void main(String[] args) {
		
		Dinner mom=new Dinner();
		Dinner dad=new Dinner();
		Dinner kid=new Dinner();
		
		System.out.println("Pizza slices : "+dad.pizzaSlices);
		mom.takeASlice(2);
		kid.takeASlice();
		dad.takeASlice(3);
		System.out.println(dad.pizzaSlices);
		System.out.println(mom.pizzaSlices);
		System.out.println(kid.pizzaSlices);
		
		

		
		
		
		
		
		
	}

}
