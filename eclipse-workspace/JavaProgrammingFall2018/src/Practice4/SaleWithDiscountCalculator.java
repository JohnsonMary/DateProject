package Practice4;
import java.util.Scanner;

public class SaleWithDiscountCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the unit price");
	    double unitPrice=scan.nextDouble();
	    System.out.println("Please enter the quantity");
	    double q=scan.nextDouble();
	    
	    double grandTotal=unitPrice*q;
	
	    double discountApplied10=grandTotal*10/100;
	    double total10=grandTotal-discountApplied10;
	    double discountApplied15=grandTotal*15/100;
	    double total15=grandTotal-discountApplied15;
	    double total=grandTotal;
	    
	    
	    if(q>=100 && q<=120) {
	    	System.out.println("Grand total:$"+grandTotal+" Discount:%10 Discount applied:$"+discountApplied10+" Total:$"+total10);
	    }else if(q>120) {
	    	System.out.println("Grand total:$"+grandTotal+" Discount:%15 Discount applied:$"+discountApplied15+" Total:$"+total15);
	    	
	    }else if(q<100) {
	    	System.out.println("Grand total:$"+grandTotal+" Discount:%0  Total:$"+total);
	    }
	    
	    
		
		
		
		
		
		
		
	}
	
	
	
	

}
