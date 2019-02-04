package day21_Loops04;
import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word please");
		String w=scan.nextLine();
		String reversed="";
		int character=w.length()-1;
		
		while(character>=0) {
			reversed=reversed+w.charAt(character);
			
			character--;
			
			
		}System.out.println(reversed);

		if(w.substring(0,w.length())== reversed) {
			System.out.println("It's a palindrome");
			
		}else {
			System.out.println("Not a palindrome");
		}
		
		
		
		
		
		
		
		
	}

}
