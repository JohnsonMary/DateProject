package Practice2;
import java.util.Scanner;

public class RushHourTollCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("How many miles did you drive?");
		int miles=scan.nextInt();
	    
		System.out.println("Enter the number according to hour:\n"+
		                    "1.Normal Hour\n"+
		                    "2.Rush Hour");
		int hour=scan.nextInt();
		
		int price=0;
		
		if(hour==1) {
		    System.out.println("NORMAL HOUR SELECTED");
			if(miles>=0 && miles<=100) {
				price=5;
		   }else if(miles>=101 && miles<=500) {
			   price=8;
		   
		   }else if(miles>=501 && miles<=1000){
			   price=10;
			   
		   }else if(miles>1000) {
			   price=12;
	    }
		}else if(hour==2) {
			System.out.println("RUSH HOUR SELECTED");
	    	if(miles>=0 && miles<=100) {
	    		price=10;
	    		
	    	}else if(miles>=101 && miles<=500) {
	    		price=16;
	    		
	    	}else if(miles>=501 && miles<=1000) {
	    		price=20;
	    		
	    	}else if (miles>1000) {
	    		price=24;
	    		
	    	}
	    	
	    }		   
	    	System.out.println("If you took "+miles+" miles,then you need to pay $"+price);
   
		   }
		   }
		
	

	
