package Pratice7;
import java.util.Scanner;

public class GiveMe5Dollars {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
         int amount;
         int tries=0;
		
		do {
			System.out.println("Give me 5 bucks");
			amount=scan.nextInt();
			tries++;
			if(tries==3) {
				System.out.println("I don't need anymore!");
			    break;	
			}
			
		}while(amount!=5);
		
		System.out.println("Thank you!");
		   
		
		
		
		
		
	}

}
