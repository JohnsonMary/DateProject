package day9_conditionals3;
import java.util.Scanner;

public class TollCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the distance that you drove:");
		int miles=scan.nextInt();
		double tollCost;
		
		if (miles>0 && miles<=100) {
			tollCost=5.0;
			
		}else if(miles>=101 && miles<=500) {
			tollCost=8.0;
			
		}else if(miles>=501 && miles<=1000) {
			tollCost=10.0;
			
		}else if(miles>=1000) {
			tollCost=12.0;
			
		}else {
			tollCost=0;
		}
			System.out.println("If your mile is "+miles+",then you need to pay $"+tollCost+" for toll.");	
		
		
	}

}



         
