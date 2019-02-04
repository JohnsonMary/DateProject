package day31_MethodsWithReturn;
import java.util.*;


public class GuessTheNumber {
	public static void main(String[] args) {
		
		playGuessNumComputerOnly();
		playGuessNumWithLimit(10);
		
		
		
	}

	public static void playGuessNumComputerOnly() {
		
		Random random=new Random();
		int secretNumber=random.nextInt(21);
		int counter=0;
		
		do {
			counter++;
			System.out.println("Guess the secret number");
			int guessNumber=random.nextInt(21);
			System.out.println("Guessing: "+guessNumber+" Counter: "+counter);
			
			if(secretNumber== guessNumber) {
				System.out.println("You won!Guessed the secret number");
				break;
			}else {
				System.out.println("Wrong!Try again!");
				
			}

		    }while(true);
		
		
		
	}
	public static void playGuessNumWithLimit(int limit) {
		
		Random random=new Random();
		int secretNumber=random.nextInt(21);
		int counter=0;
		
		do {
			counter++;
			System.out.println("Guess the secret number");
			int guessNumber=random.nextInt(21);
			System.out.println("Guessing: "+guessNumber+" Counter: "+counter);
			
			if(secretNumber== guessNumber) {
				System.out.println("You won!Guessed the secret number");
				break;
			}else {
				System.out.println("Wrong!Try again!");
				
			}
			if(counter==limit) {
				System.out.println("You lost!Game over!");
				
			}

		    }while(true);
		
		
		
	}
	public static void playGuessNumComputerVSMe(int secretNum) {
		
		

		
}
}
