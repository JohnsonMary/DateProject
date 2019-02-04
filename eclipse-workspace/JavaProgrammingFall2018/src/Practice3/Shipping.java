package Practice3;
import java.util.Scanner;

public class Shipping {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please select the shipping method:\n"+
		                   "1.Regular Shipping\n"+
				           "2.Express Shipping\n");
		int shipping=scan.nextInt();
		int cost=0;
		System.out.println("Please write the purchase price");
		int price=scan.nextInt();
		
		if(shipping==1) {
			System.out.println("REGULAR SHIPPING HAS BEEN SELECTED");
			if(price>=1 && price<=100) {
				cost=17;
				
			}else if(price>=101 && price<=300) {
				cost=10;
				
			}else if(price>300) {
				cost=0;
				
			}
			
	   }else if(shipping==2) {
		   System.out.println("EXPRESS SHIPPING HAS BEEN SELECTED");
		    
		     if(price>=1 && price<=100) {
		    	 cost=35;
		    	 
		     }else if(price>=101 && price<=300) {
		    	 cost=25;
		    	 
		     }else if(price>300) {
		    	 cost=15;
		    	 
		     }
		   
	        }System.out.println("If the purchase price is "+price+" then,you need to pay $"+cost); 
		
		
		
		
		
		
		
	}

}
