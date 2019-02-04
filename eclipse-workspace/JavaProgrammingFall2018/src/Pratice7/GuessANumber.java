package Pratice7;
import java.util.Scanner;
import java.util.Random;

public class GuessANumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int guessedNumber=0;
		int secretNumber=0;
		Random random=new Random();
		secretNumber=random.nextInt(10);
		int iTries=0;
		
		do {
			System.out.println("Guess a number");
			guessedNumber=scan.nextInt();
			iTries++;
			
			
			
			if(guessedNumber==secretNumber) {
				System.out.println("You won!!!");
				break;
				
			}else if(guessedNumber>secretNumber) {
				System.out.println("Too large");
				
			}else {
				System.out.println("Too small");
			}
			
			if(iTries==3) {
				System.out.println("You lost!");
				System.out.println("The number was "+secretNumber);
				break;
			}
				
		}while(guessedNumber!=secretNumber);
		
		
		
		
		
	}

}
