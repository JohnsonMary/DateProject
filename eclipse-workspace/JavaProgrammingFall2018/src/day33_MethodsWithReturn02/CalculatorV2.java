package day33_MethodsWithReturn02;

public class CalculatorV2 {
	
	
	public static void main(String[] args) {
		
	}
		
	public static  double add (double num1,double num2) {
		double result=num1+num2;
		return result;
		
}
	public static  double subtract(double num1,double num2) {

		double result=num1-num2;
		return result;	
}
    public static double multiply(double num1,double num2) {
		
		double result=num1*num2;
		return result;
		
	}
	
    public static double divide (double num1,double num2) {
    	
    	double result=0;
	
	if(num2==0) {
		System.out.println("ERROR:Can not divide by zero");
		return -1;
	}
	
	result=num1/num2;
	return result;
	
	}
	
	public static double calculator(double n1,double n2,char operator ) {

		
		switch(operator) {
		
		case '+':
			return add(n1,n2 );
		case '-':
			return subtract(n1,n2);
		case '*':
			return multiply(n1,n2);
		case '/':
			return divide(n1,n2);
		default:
			throw new RuntimeException("ERROR: Invalid Operator " + operator);
		
		}
		}
	
}





	


