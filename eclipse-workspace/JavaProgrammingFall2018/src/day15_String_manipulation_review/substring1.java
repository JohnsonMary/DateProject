package day15_String_manipulation_review;
import java.util.Scanner;

public class substring1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=scan.nextLine();
		
		if(word.startsWith("x")) {
			System.out.println(word.substring(1));
			
		}else {
			System.out.println("Not valid");
		}
		
		
		
		
		
		
		
	}

}
