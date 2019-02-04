package day5_operators;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
    	/*Write a program that asks user to enter 3 numbers from keyboard
    	 * and calculates the sum of those numbers then show result
    	 * 
    	 * 
    	 */
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter first number");
    	int first=scan.nextInt();
        System.out.println("Enter second number");
        int second=scan.nextInt();
    	System.out.println("Enter third number");
    	int third=scan.nextInt();
    	int sum=(first+second+third);
    	System.out.println("The sum is "+sum);
    	
    	System.out.println("Enter 3 numbers");
    	int num1= scan.nextInt();
    	int num2=scan.nextInt();
    	int num3=scan.nextInt();
    	
    	int total=num1+num2+num3;
    	System.out.println("The sum is "+total);
    	
    	
    			
	
}		
	}

