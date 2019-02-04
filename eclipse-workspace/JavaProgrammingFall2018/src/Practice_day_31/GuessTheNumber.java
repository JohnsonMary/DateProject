package Practice_day_31;
import java.util.*;



public class GuessTheNumber {
	public static void main(String[] args) {
		
		playGuessNumComputerOnly();
		playGuessNumWithLimit(4);
		sayHi();
		sayHi(2);
		
	}
	public static void  playGuessNumComputerOnly() {
		
		Random random=new Random();
		System.out.println("Secret number");
		int secretNumber=random.nextInt(5);
		int counter=0;
		int guessedNumber=0;
		
		
		do {
			counter++;
			System.out.println("Guessing: "+guessedNumber+" Counter: "+counter);
			guessedNumber=random.nextInt(5);
			
			if(guessedNumber==secretNumber) {
				System.out.println("You won!");
				break;
				
			}else {
				System.out.println("Wrong!Try again!");
			}

			
		}while(true);
		
		
		
	}
		
		public static void playGuessNumWithLimit(int limit) {
			
			Random random=new Random();
			int counter=0;
			System.out.println("Secret Number");
			int secretNumber=random.nextInt(10);
			int guessedNumber=0;
			
			
			do {
				counter++;
				System.out.println("Guessing: "+guessedNumber+" Counter: "+counter);
				 guessedNumber=random.nextInt(10);
				
				if(guessedNumber==secretNumber) {
					System.out.println("You won!");
					break;
					
				}else {
					System.out.println("Wrong!Try again!");
				}
				if(counter==limit) {
					System.out.println("You lost!Game over!");
					break;
					
				}

				
			}while(true);
			
			
			
			
		}
	
		public static void sayHi() {
			
			System.out.println(1234);
			System.out.println("Hello");
		}
		
		public static void sayHi(int n) {
			
			System.out.println("Hello!");
		}
	}

