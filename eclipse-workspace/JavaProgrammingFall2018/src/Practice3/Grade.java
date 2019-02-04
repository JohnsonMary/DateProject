package Practice3;
import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the grade\n"+
		                   "A,B,C or D?");
		char grade=scan.next().charAt(0);
		
		switch (grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Acceptable");
			break;
		case 'D':
			System.out.println("Poor");
			break;
		default:
			System.out.println("ERROR:Invalid grade");
			break;
			
		
		
		
		}
		
		
		
	}

}
