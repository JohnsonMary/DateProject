package Practice1;

public class Apples {
	public static void main(String[] args) {
		double apples=1.5;
		float carrots=3.5f;
		double tomatoes=4.5;
		
		double total=apples+carrots+tomatoes;
		System.out.println("The prices of vegetables:Apples $"+apples+",carrots $"+carrots+",tomatoes $"+tomatoes);
		System.out.println("The total is $"+total);
		
		double tax=total*0.06;
		System.out.println("The tax is "+tax);
		double grandTotal=total+tax;
		System.out.println("If total is $ "+total+" then,the grand total is $"+grandTotal);
		
		
	}
	

}
