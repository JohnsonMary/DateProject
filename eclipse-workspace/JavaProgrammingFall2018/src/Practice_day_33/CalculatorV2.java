package Practice_day_33;

public class CalculatorV2 {
	public static void main(String[] args) {
		
		System.out.println(calculate(23,4,'*'));
		
		
	}

	
	public static double add(double num1,double num2) {
		double result=num1+num2;
        return	 result;	
}
	
	public static double subtract(double num1,double num2) {

		double result=num1-num2;
        return	 result;	
	
}
	public static  double multiply(double num1,double num2) {
		
		double result=num1*num2;
        return	 result;	
}
	public static double divide(double num1,double num2) {
		
		if(num2==0) {
			System.out.println("ERROR:Can not divide by zero");
			return -1;
			
		}else {
		
		double result=num1/num2;
        return	 result;	
		
		}
		
	}
	
	public static double calculate(double n1,double n2,char operator) {
		
		switch (operator) {
		
		case '+':
			return n1+n2;
		case '-':
			return n1-n2;
		case '*':
			return n1*n2;
		case '/':
			return n1/n2;
		default:
			throw new RuntimeException ("ERROR: Invalid Operator "+operator);
			
		
		}
		
		
	}
	
	
	
	
}	

