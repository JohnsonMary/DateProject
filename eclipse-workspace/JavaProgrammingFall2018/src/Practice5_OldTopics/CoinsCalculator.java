package Practice5_OldTopics;
import java.util.Scanner;

public class CoinsCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many pennies do you have?");
		int pennies=scan.nextInt();
		
		int dollars=pennies/100;
		pennies%=100;
		
		int quarters=pennies/25;
		pennies%=25;
		
		int dimes=pennies/10;
		pennies%=10;
		
		int nickels=pennies/5;
		pennies%=5;
		
		int cents=pennies;
		
		System.out.println("Dollars: "+dollars);
		System.out.println("Quarters: "+quarters);
		System.out.println("Dimes: "+dimes);
		System.out.println("Nickels: "+nickels);
		System.out.println("Cents: "+cents);

		
		
		
		
		
		
	}

}
