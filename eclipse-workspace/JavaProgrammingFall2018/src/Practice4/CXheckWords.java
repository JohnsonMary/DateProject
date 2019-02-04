package Practice4;
import java.util.Scanner;

public class CXheckWords {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the first word");
		String word1=scan.nextLine();
		System.out.println("Please enter the second word");
		String word2=scan.nextLine();
		System.out.println("Please enter the third word");
		String word3=scan.nextLine();
		
		int w1=word1.length();
		int w2=word2.length();
		int w3=word3.length();
		
		if((w1==w2 && w2==w3)||(w1==w3 && w3==w2)||(w2==w3 && w3==w1)) {
			System.out.println("All words are at the same length");
			
		}else if(w1==w2||w2==w3||w1==w3) {
			System.out.println("Not same nor different length");
			
		}else {
			System.out.println("All different length");
		}
		
		
		
		
		
		
		
	}

}
