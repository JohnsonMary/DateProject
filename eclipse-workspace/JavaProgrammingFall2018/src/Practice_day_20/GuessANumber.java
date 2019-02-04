package Practice_day_20;
import java.util.Scanner;
import java.util.Random;

public class GuessANumber {
	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		Random random=new Random();
		
		int secretNumber=random.nextInt(10);
		int guessedNumber=0;
		int iTries=0;
		
		do {
			System.out.println("Guess a number");
		     guessedNumber=input.nextInt();
		     iTries++;
		     
		     if(iTries==5) {
		    	 System.out.println("You lost!");
		    	 System.out.println("The secret number is "+secretNumber);
		    	 break;
		    	 
		     }
		     
		    if(guessedNumber==secretNumber) {
		    	System.out.println("You won!");
		    	
		    }else if(guessedNumber>secretNumber) {
		    	System.out.println("Too large!");
		    	
		    }else {
		    	System.out.println("Too small!");
		    }
			
		}while(secretNumber!=guessedNumber && iTries!=5); {
			
		}
		
		
		
		
		
		
		
		
		
	}

}
