package Practice3;
import java.util.Scanner;


public class TollCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many miles did you drive?");
		int miles=scan.nextInt();
		boolean isRushHour=false;
		int price=0;
		
		if(miles>=0 && miles<=100) {
			if(isRushHour) {
				price=5;
		  }else {
			   price=10;
		  }
			
	  }else if(miles>=101 && miles<=500) {
		    if(isRushHour) {
		    	price=8;
		    	
		    }else {
		    	price=16;
		    }
		
	  }else if(miles>=501 && miles<=1000) {
		    if(isRushHour) {
		    	price=10;
		    	
		    }else {
		    	price=20;
		    }
		
	}else if (miles>1000) {
		    if(isRushHour) {
		    	price=12;
		    	
		    }else {
		    	price=24;
		    }
		
	}   System.out.println("If you drove "+miles+" miles,then the price is $"+price);

				
	}

}
