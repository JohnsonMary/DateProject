package Practice1;
import java.util.Scanner;

public class Age2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the year of birth");
		int birthYear=scan.nextInt();
		System.out.println("Enter the current year");
		int currentYear=scan.nextInt();
		
		int age=currentYear-birthYear;
		System.out.println("If you were born on "+birthYear+ " and the current year is "+currentYear+".You are "+age+" years old.");
		
			
	}
	

}
