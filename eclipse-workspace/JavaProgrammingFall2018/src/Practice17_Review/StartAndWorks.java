package Practice17_Review;
import java.util.Scanner;

public class StartAndWorks {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Write the first word ");
		String w1=input.nextLine();
		System.out.println("Write the second  word ");
		String w2=input.nextLine();
		
		if(w1.length()!=5 && (w2.length()!=5)) {
			System.out.println("Buzz,did not match!");
			
		}else if(w1.length()!=5|| w2.length()!=5) {
			System.out.println("Need to be exactly 5 chars length!");
			
		}else if(w1.charAt(w1.length()-1)== w2.charAt(0)) {
			System.out.println("Fizz");
			
		}
		
		
		
		
	}

}
