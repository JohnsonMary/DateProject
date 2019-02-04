package HomeWork;
import java.util.Scanner;

public class MiddleCharacter {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please write a word");
		String word=input.next();
		String middleCh="";
		
		if(word.length()%2==0) {
			middleCh=word.substring(word.length()/2-1, word.length()/2+1);
			System.out.println("The middle character in the string is "+middleCh);
			
		}else {
			System.out.println(word.charAt(word.length()/2));
			
		}
		
		
		
		
		
		
	}

}
