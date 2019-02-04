package Practice_day_20;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=scan.next();
		
		String reversed="";
		
		for(int i=word.length()-1; i>=0; i--) {
			
		reversed=reversed+word.charAt(i);
		
		}System.out.println(reversed);

		
		
		
		
		
		
	}

}
