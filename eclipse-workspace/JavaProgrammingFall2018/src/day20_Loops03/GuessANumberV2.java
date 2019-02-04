package day20_Loops03;

import java.util.Random;
import java.util.Scanner;

public class GuessANumberV2 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		Random random=new Random();
		
		int secretNumber=random.nextInt(100);
		int guessedNumber;
		
		do {
			System.out.println("Guess the number");
			guessedNumber=input.nextInt();
			
			if(guessedNumber==secretNumber) {
				System.out.println("Congratulations!You won!");
				
			}else if(guessedNumber>secretNumber) {
				System.out.println("Too large");
			}else {
				System.out.println("Too small");
			}
			
		}while(secretNumber!=guessedNumber);
		
		
		
		
	}

}
