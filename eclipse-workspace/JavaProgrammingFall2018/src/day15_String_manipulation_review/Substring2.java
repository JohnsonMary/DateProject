package day15_String_manipulation_review;
import java.util.Scanner;

public class Substring2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word");
		String word=scan.nextLine();
		char w0=word.charAt(0);
		char w1=word.charAt(1);
		char w3=word.charAt(2);
		
		
		if(((w0==('x')&& w1==('x')))) {
		   System.out.println(word.substring(2));
			
			
		}else if(w0==('x')){
			System.out.println(word.substring(1));
			
		}else if(w1==('x')) {
			System.out.println(word.substring(0, 1)+word.substring(2));
			
		}else if(w3=='x') {
			System.out.println(word);
			
		}
			
		
		
		
		
	}

}
