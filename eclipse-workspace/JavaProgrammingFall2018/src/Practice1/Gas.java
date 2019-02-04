package Practice1;
import java.util.Scanner;

public class Gas {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter current miles");
		double currentMiles=scan.nextDouble();
		System.out.println("Enter previous miles");
		double previousMiles=scan.nextDouble();
		System.out.println("Enter number of gallons");
		double gallons=scan.nextDouble();
		double mpg=(currentMiles-previousMiles)/gallons;
		
		System.out.println("MPG value is "+mpg);
		System.out.println("Enter the price of gallon");
		double pricePerGallon=scan.nextDouble();
		double totalCost=gallons*pricePerGallon;
		System.out.println("Total cost is $"+totalCost);
	}

}
