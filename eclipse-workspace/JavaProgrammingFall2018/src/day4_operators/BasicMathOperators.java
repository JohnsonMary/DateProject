package day4_operators;

public class BasicMathOperators {
	public static void main(String[]args) {
		//create 2 int variables and assign values
		
		int num1=100;
		int num2=200;
		System.out.println(num1+num2);
		System.out.println(num1+num2+1000);
		
		int sum= num1+num2+10;
		System.out.println("Sum is "+sum);
		
		//Create 3 variables:apples,carrots,tomatoes
		//add prices to it with decimals
		//create a variable called total and assign total price
		//also print the tax then add the task to the total
		//print your total is total price with tax
		
		double apples=1.5;
		double carrots=0.5;
		float tomatoes=2.5F;
		double totalBeforeTax=apples+carrots+tomatoes;
		System.out.println("Total before tax is "+ totalBeforeTax);
		
		//calculate tax
		double tax=totalBeforeTax*0.06;
		System.out.println("Total tax: "+tax);
		double grandTotal=totalBeforeTax+tax;
		System.out.println("Your total is $"+grandTotal);
		
			
		
		
		
	}
}
