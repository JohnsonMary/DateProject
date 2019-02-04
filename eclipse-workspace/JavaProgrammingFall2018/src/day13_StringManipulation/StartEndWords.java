package day13_StringManipulation;
import java.util.Scanner;

public class StartEndWords {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first word with 5 characters");
		String word1=scan.nextLine();
		System.out.println("Enter the second word with 5 characters");
		String word2=scan.nextLine();
		
		
	   if(!(word1.length()==word2.length())) {
			System.out.println("Need to be exactly 5 chars length");
			
			
		}else if(word1.charAt(4)==word2.charAt(0)) {
			System.out.println("Fizz");
			
		}else if(word1!=word2) {
			System.out.println("Buzz-didn't match");
			
		}
		
		
		
		
		
	}
}