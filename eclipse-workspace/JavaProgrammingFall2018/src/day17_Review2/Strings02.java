package day17_Review2;
import java.util.Scanner;

public class Strings02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=scan.nextLine();
		
		if(word.length()>=4) {
			
		    if(word.charAt(0) == word.charAt(word.length()-1)) {
			System.out.println("First is the same");
			
		  } else if(word.charAt(1)==word.charAt(word.length()-2)){
			System.out.println("Second is the same");
			
		  }
	 
	   }else {
		  System.out.println("ERROR:At least 4 character is required");
	  } 		
		
		
	}

}
