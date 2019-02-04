package day15_String_manipulation_review;
import java.util.Scanner;

public class DuplicateIt {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first word");
		String word1=scan.nextLine();
		System.out.println("Enter the second word");
		String word2=scan.nextLine();
		int word22=word2.length()-1;
		int word11=word1.length()-1;
		String wrd=word1.substring(0,word11);
		
		
		
		if(word1.charAt(word22)==word2.charAt(0)) {
			System.out.println(wrd+word2);
			
		}else {
			System.out.println("Invalid");
		}
		
		
		
		
		
	}

}
