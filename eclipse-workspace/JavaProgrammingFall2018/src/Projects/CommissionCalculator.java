package Projects;
import java.util.Scanner;

public class CommissionCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How much did you sell today?");
		double yourSales=scan.nextDouble();
		
		double target=500;
		double bonus=0;
		String performance="";
		
		if(yourSales>=2*target) {
			performance="Excellent";
			bonus=1000;
				
		}else if(yourSales>=1.5*target) {
			performance="Fine";
			bonus=500;
			
		}else if(yourSales==target || yourSales<target) {
			performance="Satisfactory";
			bonus=100;
			
		}else if(yourSales==0){
			System.out.println("You're fired!");
			
		}
		    System.out.println("Your performance is "+performance);
		    System.out.println("Your bonus is $"+bonus);
		    
				
		
		
		
		
		
	}

}
