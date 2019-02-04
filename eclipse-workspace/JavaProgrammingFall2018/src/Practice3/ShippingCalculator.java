package Practice3;
import java.util.Scanner;

public class ShippingCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int cost=0;
		
		System.out.println("Select your shipping type:\n"+
		                    "1.Regular Shipping\n"+
		                    "2.Express Shipping");
		int shipping=scan.nextInt();
		
		System.out.println("Write the price of the item");
		int price=scan.nextInt();
		
		if(shipping==1) {
			System.out.println("Regular Shipping Selected");
			if(price>=1 && price<=100) {
				cost=17;
				
			}else if(price>=101 && price<=300) {
				cost=10;
				
			}else if(price>300) {
				cost=0;
				
			}
		}else if(shipping==2) {
			System.out.println("Express Shipping Selected");
			if(price>=1 && price<=100) {
				cost=35;
				
			}else if(price>=101 && price<=300) {
				cost=25;
				
			}else if(price>300) {
				cost=15;
				
			}
		} System.out.println("Total cost is $"+cost);
		
	}

}
