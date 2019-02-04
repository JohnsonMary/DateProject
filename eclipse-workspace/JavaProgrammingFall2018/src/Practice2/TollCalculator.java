package Practice2;
import java.util.Scanner;

public class TollCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many miles did you drive?");
		int miles=scan.nextInt();
	    int price=0;
	    
	    if(miles>=0 && miles<=100) {
	    	price=5;
	    	
	    }else if(miles>=101 && miles<=500) {
	    	price=8;
	    	
	    }else if (miles>=501 && miles<=1000) {
	    	price=10;
	    	
	    }else if(miles>1000) {
	    	price=12;
	    	
	    }else {
	    	System.out.println("invalid");
	    }
		
		System.out.println("If you took "+miles+" miles,then you need to pay $"+price);
	}

}
