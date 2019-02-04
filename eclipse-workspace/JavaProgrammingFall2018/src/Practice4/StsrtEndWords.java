package Practice4;
import java.util.Scanner;

public class StsrtEndWords {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter the first word with 5 characters");
		String w1=scan.nextLine();
		System.out.println("Please enter the second word with 5 characters");
		String w2=scan.nextLine();
		
		if(w1.length()!=5||w2.length()!=5) {
			System.out.println("Need to be exactly 5 chars length");
			
		}else if(w1.charAt(4)== w2.charAt(0)) {
			System.out.println("Fizz");
			
		}else if(w1.length() !=w2.length()) {
			System.out.println("Buzz,did not match");
			
		}else {
			System.out.println("They match!");
		}
		

			
		}

}
