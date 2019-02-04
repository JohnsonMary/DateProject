package Practice5_Questions;
import java.util.Scanner;

public class SameOrNot {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word");
		String word=scan.nextLine();
		
		if(word.charAt(0)== word.charAt(word.length()-1)) {
			System.out.println("True!");
			
		}else {
			System.out.println("False");
		}
				
		
		
		
		
		
		
		
	}

}
