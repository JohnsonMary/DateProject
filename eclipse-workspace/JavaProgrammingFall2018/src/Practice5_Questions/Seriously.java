package Practice5_Questions;
import java.util.Scanner;

public class Seriously {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=scan.nextLine();
		char l1='l';
		char l2='y';
		
		//First way:
		
		if((word.charAt(word.length()-1))+(word.charAt(word.length()-2))== (l1+l2)) {
			System.out.println("Really?");
		}else {
			System.out.println("Never mind!");
		}
		
		//Second way:
		
		if(word.endsWith("ly")) {
			System.out.println("Really?");
			
		}else {
			System.out.println("Never mind");
		}
		
		
		
		
		
		
	}

}
