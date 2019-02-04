package day4_operators;
import java.util.Scanner;


public class Temperature {
	public static void main (String[]args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a fahrenheit value");
	    
		double fahrenheitValue=scan.nextInt();
		
		double celsius=(5.0/9)*(fahrenheitValue-32);
		System.out.println("If Celsius value is "+fahrenheitValue+" then,fahrenheit is "+celsius);
		
	
	
	}

}
