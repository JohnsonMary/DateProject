package day43_Static_Constructor02;

public class Calculations {
	public static void main(String[] args) {
		
		System.out.println(Calculator.plus(5, 3));
		System.out.println(Calculator.minus(50, 3));
		
		Calculator numbers=new Calculator();
		System.out.println(numbers.multiply(4, 3));
		System.out.println(numbers.plus(5, 6));
		
		
		
		
		
	}

}
