package day33_MethodsWithReturn02;

public class ConverterUtility {
	public static void main(String[] args) {
		
		System.out.println(mile2Km(98.0));
		System.out.println(fahrenheitToCelcius(72));
		
	}

	public static double mile2Km (double miles) {
		
		 double km=miles*1.60934;
		return km;
		
		
	}
	public static int fahrenheitToCelcius(int fahrenheit) {
		
		
		int celcius=(fahrenheit-32)*5/9	;	  
		return celcius;
		
	}
}
