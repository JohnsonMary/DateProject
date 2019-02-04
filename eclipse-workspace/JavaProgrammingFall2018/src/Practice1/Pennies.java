package Practice1;
import java.util.Scanner;

public class Pennies {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the amount of pennies that you have");
		int pennies=scan.nextInt();
		
		int dollars=pennies/100;
		pennies%=100;
		
		int quarters=pennies/25;
		pennies%=25;
		
		int dimes=pennies/10;
		pennies%=10;
		
		int nickels=pennies/5;
		pennies%=5;
		
		int coins=pennies;
		
		
		System.out.println("You have "+dollars+" dollars,");
		System.out.println(quarters+" quarters,");
		System.out.println(dimes+" dimes,");
		System.out.println(nickels+" nickels,");
		System.out.println(coins+" cents.");

		
			
			
			
				
		
	}

}
