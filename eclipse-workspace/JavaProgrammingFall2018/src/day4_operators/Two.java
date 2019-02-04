package day4_operators;

public class Two {
	public static void main(String[]args) {
		
		double apples=1.5;
		double carrots=2.5;
		float tomatoes=1.5f;
		double total=apples+carrots+tomatoes;
		
	   System.out.println("Apples are $"+apples+","+"carrots are $"+carrots+","+"tomatoes are $"+tomatoes+".");;
	   System.out.println("The total is $"+total);
	   
	   double tax=total*0.06;
	   System.out.println("Total before tax is $"+tax);
	   
	   double grandTotal=total+tax;
	   System.out.println("Total price with tax is $"+grandTotal);
	   
	
	}
	

}
