package Practice1;

public class Vegetables2 {
	public static void main(String[] args) {
		double apples,carrots,tomatoes;
		apples=2.5;
		carrots=3.8;
		tomatoes=7.2;
		
		double total=apples+carrots+tomatoes;
		double tax=total*0.06;
		double grandTotal=total+tax;
		
		System.out.println("Apples are $"+apples+",carrots are $"+carrots+" and tomatoes are $"+tomatoes);
		System.out.println("If the tax is $"+tax+" and the total is "+total+" then;");
		System.out.println("The grand total is "+grandTotal);
	}

}
