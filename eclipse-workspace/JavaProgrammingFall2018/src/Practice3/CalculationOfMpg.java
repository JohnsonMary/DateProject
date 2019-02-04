package Practice3;
import java.util.Scanner;

public class CalculationOfMpg {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter current car odometer miles");
		double currentMiles=scan.nextDouble();
		System.out.println("Please enter previous car odometernmiles");
		double previousMiles=scan.nextDouble();
		System.out.println("How many gallons?");
		double gallons=scan.nextDouble();
	    double mpg;
		mpg=(currentMiles-previousMiles)/gallons;
		System.out.println("The mpg is "+mpg);
		double pricePerGallon=0.0;
		System.out.println("What is the price per gallon?");
		pricePerGallon=scan.nextDouble();
		
		double totalCost=gallons* pricePerGallon;
		System.out.println("Total cost is "+totalCost);
		
		
		
		
		
		
		
	}

}
