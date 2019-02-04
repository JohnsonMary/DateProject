package Practice1;
import  java.util.Scanner;

public class Numbers1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber=scan.nextInt();
		System.out.println("Enter second number");
		int secondNumber=scan.nextInt();
		System.out.println("Enter third number");
		int thirdNumber=scan.nextInt();
		
		int x=firstNumber*secondNumber*thirdNumber;
		System.out.println("First number is " + firstNumber+",second number is "+secondNumber+",third number is "+thirdNumber+".");
		System.out.println("When you multiplicate these number you get "+ x);
		
		
		
				
		
	}

}
