package Practice_day_20;
import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		 int start=scan.nextInt();
		 int end=scan.nextInt();
		
		
		if(start<end) {
			while(start<=end) {
				System.out.println("Step "+start);
				start++;
				
			}
	}else if(start>end) {
		   while(start>=end) {
			   System.out.println("Step "+start);
			   start--;
			   
		   }
		
	}else {
		System.out.println("The numbers are equal");
	}
			
			
		}
		
		
		
		
		
	}


