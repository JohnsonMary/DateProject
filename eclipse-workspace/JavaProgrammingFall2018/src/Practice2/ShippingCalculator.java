package Practice2;
import java.util.Scanner;

public class ShippingCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int cost=0;
		System.out.println("Please select the shipping type\n"+
                "1.Regular Shipping\n"+
	            "2.Express Shipping" );
        int shippingType=scan.nextInt();
		
        System.out.println("Please write the price of the product");
		int price=scan.nextInt();

		
		
	   if (shippingType==1) {
		   System.out.println("REGULAR SHIPPING HAS BEEN SELECTED");
		    if(price>=1 && price<=100) {
			  cost=17;
			  
		    }else if(price>=101 && price<=300) {
			  cost=10;
			  
		    }else if(price>300) {
			  cost=0;
			  
		  }
		   
	 }else if(shippingType==2) {
		    System.out.println("EXPRESS SHIPPING HAS BEEN SELECTED");
		    if(price>=1 && price<=100) {
			   cost=35;
		    }else if(price>=101 && price<=300) {
			   cost=25;
			   
		    }else if(price>300) {
			   cost=15;
			   
		   }

	   }
	   System.out.println("Total shipping cost is "+cost);

	}

}
