package Projects;
import java.util.Scanner;

public class BasicPhoneBillCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number of calls");
		double calls=scan.nextDouble();
		
		
		double totalPrice1=(calls-100)*0.60+200;
		double totalPrice2=(calls-150)*0.50+200;
		double totalPrice3=(calls-200)*0.40+200;
		
		
		if(calls<=100) {
			System.out.println("Bill is at least $200");
			
		}else if(calls>100 && calls<=150) {
			System.out.println("Bill is $"+totalPrice1);
			
		}else if(calls>150 && calls<=200) {
			System.out.println("Bill is $"+totalPrice2);
			
		}else if(calls>200) {
			System.out.println("Bill is $"+totalPrice3);
			
		}
			
		
		
		  
		
		
		
	}

}
