package PracticeDay_29;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Please enter a number");
	    int number=scan.nextInt();
	    
	
		
		if(number==1 || number==2) {
			System.out.println("It's a prime number");
			
	}      
		for(int i=2; i<number; i++) {
		
		if(number%i==0) {
			
			System.out.println("It's  not a prime number");
			break;

		}else {
			System.out.println("It's a prime number");
			break;
		}

}
	}
}
