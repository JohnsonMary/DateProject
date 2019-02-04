package Projects;
import java.util.Scanner;

public class NumbersToWords1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Pleaase choose a number:0,1,2,3,4,5,6,7,8,9,10");
		int num=scan.nextInt();
		
		switch (num) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10:
			System.out.println("Ten");
			break;
		default:
			System.out.println("ERROR:Invalid Number");
			break;
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
	}

}
