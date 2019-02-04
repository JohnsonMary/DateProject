package Practice_day_20;
import java.util.Scanner;
import java.util.Random;

public class Game {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Random random=new Random(10);
		
		int secretNumber=0;
		int guessedNumber=0;
		int iTries=0;
		
		do {
			System.out.println("Please guess a number");
			guessedNumber=scan.nextInt();
			iTries++;
			if(iTries==5) {
				System.out.println("You lost!");
				break;
			}
			
			if(guessedNumber==secretNumber) {
				System.out.println("You won!");
				break;
				
			}else if(guessedNumber>secretNumber) {
				System.out.println("Too large!");
				
			}else if(guessedNumber<secretNumber){
				System.out.println("Too small!");
		
			}
		}while(guessedNumber!=secretNumber && iTries!=5);
		
				
				
	
			
		}
		
		
		
		
		
		
	}


