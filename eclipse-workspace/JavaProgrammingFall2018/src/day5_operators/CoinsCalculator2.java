package day5_operators;
import java.util.Scanner;

public class CoinsCalculator2 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the amount of  pennies you have");
		int pennies=scan.nextInt();
		
		int dollar,quarter,dimes,nickels,cents;
		dollar=pennies/100;
		pennies%=100;
		System.out.println(dollar+" dollars "+ pennies+" cents.");
		
	    quarter=pennies/25;
	    pennies%=25;
	    System.out.println(quarter+" quarters "+pennies+ " cents.");
	    
	    dimes=pennies/10;
	    pennies%=10;
	    System.out.println(dimes+" dimes and "+pennies+ " cents.");
	    
	    nickels=pennies/5;
	    pennies%=5;
	    System.out.println(nickels+" nickels and "+pennies+ " cents.");
	    
	    cents=pennies;
	    System.out.println(cents+" cents.");
	    
		
		
		
		
		
	}
}
