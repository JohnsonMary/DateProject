package day20_Loops03;

import java.util.Random;
import java.util.Scanner;

public class GuessANumberV3 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		Random random=new Random();
		
		int secretNumber=random.nextInt(100);
		int guessedNumber;
		int iTries=0;
		
		
		do {
			System.out.println("Guess the number");
			guessedNumber=input.nextInt();
			iTries++;
			if(guessedNumber==secretNumber) {
				System.out.println("Congratulations!You won!");
				
			}else if(guessedNumber>secretNumber) {
				System.out.println("Too large");
			}else {
				System.out.println("Too small");
			}
			
			if(iTries==5) {
				System.out.println("You lost!");
				System.out.println("Secret number is "+secretNumber);
				break;
			}
			
		}while(secretNumber!=guessedNumber && iTries<=5);
		
		
		
		
	}

}
