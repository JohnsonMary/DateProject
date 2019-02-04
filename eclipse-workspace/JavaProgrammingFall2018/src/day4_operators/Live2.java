package day4_operators;
import java.util.Scanner;


public class Live2 {
	public static void main (String[]args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Year of death");
		int yearOfDeath=scan.nextInt();
		
		System.out.println("The year of death is "+yearOfDeath);
		System.out.println("Enter year of birth");
		int yearOfBirth=scan.nextInt();
		int yearsOfLived=yearOfDeath-yearOfBirth;
		
        System.out.println("If the person was born on "+yearOfBirth+" and died on "+yearOfDeath+" then, he lived "+yearsOfLived+" years." );
				
		
    
	}

}
