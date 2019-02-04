package day20_Loops03;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		Random random=new Random();
		
		int secretNumber=random.nextInt(10);
		int guessedNumber;
		
		do {
			System.out.println("Guess the number");
			guessedNumber=input.nextInt();
			
			if(guessedNumber==secretNumber) {
				System.out.println("Congratulations!You won!");
				
			}else {
				System.out.println("Try again");
			}
			
		}while(secretNumber!=guessedNumber);
		
		
		
		
	}

}
