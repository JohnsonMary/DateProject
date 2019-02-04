package day30_Methods;
import java.util.Scanner;


public class Calculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		double n1=scan.nextDouble();
		System.out.println("Enter the second number");
		double n2=scan.nextDouble();
		
		System.out.println("Choose an operation \n"+
		                   "1-add\n"+
				           "2-subtract\n"+
		                   "3-multiply\n"+
				           "4-divide");
		int operation=scan.nextInt();
		
		switch (operation) {

		case 1:
			add(n1,n2);
			break;
		case 2:
			subtract(n1,n2);
			break;
		case 3:
			multiply(n1,n2);
			break;
		case 4:
			divide(n1,n2);
			break;
		default:
			System.out.println("ERROR: Invalid operation");
			break;
			
		
		
		}
		
		
					
	}

	public static void add(double num1,double num2) {
		double result=num1+num2;
		System.out.println(result);
		
}
	
	public static void subtract(double num1,double num2) {

		double result=num1-num2;
		System.out.println(result);
	
}
	public static void multiply(double num1,double num2) {
		
		double result=num1*num2;
		System.out.println(result);
}
	public static void divide(double num1,double num2) {
		
		if(num2==0) {
			System.out.println("ERROR:Can not divide by zero");
		}else {
		
		double result=num1/num2;
        System.out.println(result);
		
		}
		
	}
	
	
	
	
	
}	