package CodingTasks;
import java.util.Scanner;

public class Task_3_ReversedNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		String num=scan.nextLine();
		String reversed="";
		
		for(int i=num.length()-1; i>=0; i--) {
			
			reversed=reversed+num.charAt(i);
			
			
			
		}if(num.equals(reversed)) {
			System.out.println("Palindrome number");
			
		}else {
			System.out.println("Not a palindrome number");
		}
		
		
		
		
		
		
		
		
	}

}
