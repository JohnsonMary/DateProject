package Practice_day_33;

public class Calculations {
	public static void main(String[] args) {
		
		double result= CalculatorV2.multiply(34, 70);
		System.out.println(result);
		
		if( CalculatorV2.multiply(34, 70)==2380.0) {
			System.out.println("PASS");
			
		}else {
			System.out.println("FAIL");
		}
		
	}

	
}
