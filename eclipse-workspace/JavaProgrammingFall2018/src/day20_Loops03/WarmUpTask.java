package day20_Loops03;
import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int start=scan.nextInt();
		System.out.println("Enter the second number");
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
			System.out.println("Start and end are equal");
			System.out.println("Step "+start);
		}
			
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
	}


