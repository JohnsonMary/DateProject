package day11_switchCase;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double num1,num2,result;
		result=0.0;

		System.out.println("Enter first number");
		num1=scan.nextDouble();
		System.out.println("Enter the second number");
		num2=scan.nextDouble();
		System.out.println("Choose the operator:\n"+
		                   "+,-,*,/,%");
		char operator;

		operator=scan.next().charAt(0);
		
			
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
			System.out.println("ERROR:Invalid Operator selected");
			return;
			
		
		
		}
		
		System.out.println(result);
		
		
	}

}
