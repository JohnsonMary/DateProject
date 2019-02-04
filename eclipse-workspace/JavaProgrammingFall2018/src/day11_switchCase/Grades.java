package day11_switchCase;
import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the grade?\n"+
		                    "A,B,C or D?");
		char grade=scan.next().charAt(0);
		
		switch(grade) {
		case 'A':
			System.out.println("Excellent");
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
			System.out.println("ERROR:Invalid Grade");
			break;
		   
		}
		
		
		
		
		
	}

}
