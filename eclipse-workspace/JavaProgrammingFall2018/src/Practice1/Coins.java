package Practice1;
import java.util.Scanner;

public class Coins {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the amount of coins that you have");
		int pennies=scan.nextInt();
		
		int dollars,quarters,dimes,nickels,cents;
		dollars=pennies/100;
		pennies%=100;
		
		quarters=pennies/25;
		pennies%=25;
		
		dimes=pennies/10;
		pennies%=10;
		
		nickels=pennies/5;
		pennies%=5;
		
		cents=pennies;
		
	    System.out.println("There are "+dollars+" dollars,");
	    System.out.println(quarters+" quarters,");
	    System.out.println(dimes+" dimes,");
	    System.out.println(nickels+" nickels and ");
	    System.out.println(cents+" cents.");


		
	
		
		
	}

}