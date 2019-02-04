package Practice_day_33;

import day33_MethodsWithReturn02.CalculatorV2;

public class ConverterUtility {
	public static void main(String[] args) {
		
		System.out.println(mileToKm(25));
		
		double km=mileToKm(85);
		System.out.println(km);
		
		if(mileToKm(85)<100) {
			System.out.println("Speed is good");
		}else {
			System.out.println("You need to slow down!");
		}

        int heat=fahToCelcius(75);
        
        if(heat==23) {
        	System.out.println("Test #1 passed");
        }else {
        	System.out.println("Test #1 failed");
        	}
        }

		
		

	
	public static double mileToKm(double miles) {
		
		return miles*1.60934;
		
	}
	
	public static int fahToCelcius(int fah) {
		
		int celcius=(fah-32) * 5/9;
		
		return celcius;
		
	}
	public static double mileToKmV2(double miles) {
		
		return CalculatorV2.multiply(miles, 1.60934);
	}
}
