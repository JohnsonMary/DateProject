package Practice3;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number please");
		double num1=scan.nextDouble();
		System.out.println("Enter the second number please");
		double num2=scan.nextDouble();
		System.out.println("Which operator\n"+
		                   "+,-,*,/,% ?");
		char operator=scan.next().charAt(0);
		double result;
		
		switch(operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		case '%':
			result=num1%num2;
			break;
		default:
			System.out.println("ERROR:Invalid entry");
			return;
		}	
			System.out.println("The result is "+result);
		
		
		
		
		
		
		
		
		
	}

}
