package day15_String_manipulation_review;
import java.util.Scanner;

public class MiddleOne {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word");
		String word=scan.nextLine();
		int w1=word.length();
		
		
		if((w1%2==1)|| (w1>=3)) {
			System.out.println(word.charAt(w1/2));
			
		}
		
		
		
		
		
		
	}

}
