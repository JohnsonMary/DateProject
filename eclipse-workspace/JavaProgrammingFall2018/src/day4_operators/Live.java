package day4_operators;
import java.util.Scanner;

public class Live {
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter year of birth");
		int yearOfBirth=scan.nextInt();
		
		System.out.println("Enter year of death");
		int yearOfDeath=scan.nextInt();
		
		int yearsLived=yearOfDeath-yearOfBirth;
		System.out.println("If he was born on "+yearOfBirth+" and died on "+yearOfDeath+ " then,he lived "+yearsLived+" years.");
		
			
		
	}

}
