package PtacticeD_day_34;

public class Calculator {
	public static void main(String[] args) {
		
		System.out.println(calculate(12,34,'*'));
		System.out.println(calculate(3,7,'+'));
		System.out.println(calculate(2,4,'/'));
		
		double result=calculate(23,4,'*');
		System.out.println(result);
		
		if(calculate(23,4,'*')==92) {
			System.out.println("#1 test passed");
			
		}else {
			System.out.println("#1 test failed");
		}
		
		
	}

	public static double add(double n1,double n2) {

		double result=n1+n2;
		return result;
}
	public static double subtract(double n1,double n2) {
		
		double result=n1-n2;
		return result;
		
		}
	public static double multiply(double n1,double n2) {
		
		double result=n1*n2;
		return result;
	}
	public static double divide(double n1,double n2) {
		
		double result=n1/n2;
		return result;
	}
	
	public static double calculate(double n1,double n2,char operator) {
		
		switch(operator) {
		
		case '+':
			return add(n1,n2);
		case '-':
			return subtract(n1,n2);
		case '*':
			return multiply(n1,n2);
		case '/':
			return divide(n1,n2);
		default:
			throw new RuntimeException("ERROR: Invalid operator "+operator);
			
			
			
		
		
		}
	}
}