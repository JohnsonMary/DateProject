package day4_operators;
import java.util.Scanner;



public class Age{
	public static void main(String[]args) {
		
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter current year");
	int currentYear=scan.nextInt();
	
	System.out.println("Enter year of birth");
	int yearOfBirth=scan.nextInt();
	
	int age=currentYear-yearOfBirth;
	System.out.println("If you were born on "+yearOfBirth+" and current year is "+currentYear+" then,your age is "+age);
	
	
	
	
}
}
		
		
		
				
		
		
	


