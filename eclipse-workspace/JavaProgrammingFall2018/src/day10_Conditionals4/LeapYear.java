package day10_Conditionals4;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Which year?");
		int year=scan.nextInt();
		
		if(year%400==0) {
			System.out.println("It's a leap year!");
	
			
		}else if(year%4==0 && year%100!=0) {
			
		System.out.println("It's a leap year!");
		}else {
			System.out.println("It's not leap year!");
		}
        
        	
        } 
}