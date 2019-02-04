package day15_String_manipulation_review;
import java.util.Scanner;

public class MiddleThree {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word");
		String word=scan.nextLine();
		int w1=word.length();
		String w2=word.substring((w1/2)-1,(w1/2)+2);
		       
		
		if(w1%2==1 && w1>=5) {
			System.out.println(w2);
			
		}
		
		
		
		
		
	}

}
