package day6_operators_boolean;
import java.util.Scanner;

public class WarmUpTasks {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

        System.out.println("Enter current car odometer miles");
        double current=scan.nextDouble();
        System.out.println("Enter previous car odometer miles");
        double previous=scan.nextDouble();
        System.out.println("Enter how many number of gallons you put");
        double gallon=scan.nextDouble();
        
        System.out.println("Enter gallons");
        double gallons=scan.nextDouble();
        System.out.println("Price per gallon");
        double pricePerGallon=scan.nextDouble();
        
       
        double mpg=(current-previous)/gallon;
        System.out.println("Mpg is "+mpg);
        
        double totalCost=gallons*pricePerGallon;
        System.out.println("Your total cost is $"+totalCost);
        
        
        
        
			
	   
	   
	    
	    
	    
	}

}
