package Practice4;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=scan.nextInt();
		
		if((year%400==0)||(year%4==0 && year%100==1)) {
			System.out.println("It's a leap year!");
			
		}else {
			System.out.println("Regular year!");
		}
		
		
		
		
		
		
	}

}
