package day9_conditionals3;
import java.util.Scanner;

public class ShippingCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the price of the product?");
		double price=0.0;

		price=scan.nextDouble();
		System.out.println("Please add shipping type.1.Regular,2.Express");
		boolean shippingMode=scan.nextBoolean();
		
		double shippingCost=0.0;
        	
		
		if(price>=1 && price<=100) {
			if(shippingMode) {
				shippingCost=17;
			}else{ 
				shippingCost=35;
			}
			
		}else if(price>=101 && price<=300) {
			if(shippingMode) {
				shippingCost=10;
			}else {
				shippingCost=25;
			}
			
			
		}else if(price>300) {
			if(shippingMode) {
				shippingCost=0;
			}else {
				shippingCost=15;
			}
		}
		
		System.out.println("If you purchased the item $"+price+",then for shipping you'll pay $"+shippingCost);
		
		
	}

}
