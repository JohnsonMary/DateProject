package Practice5_OldTopics;
import java.util.Scanner;

public class MilesExercise {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the current car odometer miles?");
		double cMiles=scan.nextDouble();
		System.out.println("Please enter the previous car odometer miles");
		double pMiles=scan.nextDouble();
		System.out.println("How many gallons do you have?");
		double gallons=scan.nextDouble();
		System.out.println("What is the price per gallon?");
		double pricePerGallon=scan.nextDouble();
		
		double mpg=(cMiles-pMiles)/gallons;
		System.out.println("Mpg is "+mpg);
		
		double totalCost=gallons*pricePerGallon;
		System.out.println("Total cost is "+totalCost);
		
		
		
		
		
	}

}
