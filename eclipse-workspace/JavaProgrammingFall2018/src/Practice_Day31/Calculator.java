package Practice_Day31;
import java.util.Scanner;


public class Calculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		double num1=scan.nextDouble();
		System.out.println("Enter the second number");
		double num2=scan.nextDouble();
		System.out.println("Choose an operation\n"+
				           "1.add\n"+
				           "2.subtract\n"+
				           "3.multiply\n"+
				           "4.divide");
		int operation=scan.nextInt();
		
		switch (operation) {

		case 1:
			add(num1,num2);
			break;
		case 2:
			subtract(num1,num2);
			break;
		case 3:
			multiply(num1,num2);
			break;
		case 4:
			divide(num1,num2);
		default:
			System.out.println("ERROR: Invalid operation");
		}
		
		
		
		
		
		//double n1=32;
		//double n2=3.1;
		
		//add(n1,n2);
		//subtract(n1,n2);
		//multiply(n1,n2);
		//divide(n1,n2);
		
		
		
		
	}
	
public static void add(double num1,double num2) {

	double result=num1+num2;
	System.out.println(result);
	
}

public static void subtract(double num1,double num2) {
	
	
	double result= num1-num2;
	System.out.println(result);
	
}
public static void multiply(double num1,double num2) {
	
    double result=num1*num2;
    System.out.println(result);
}
public static void divide(double num1,double num2) {
	
	double result=num1/num2;
	System.out.println(result);
}

}










