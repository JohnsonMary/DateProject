package Practice2;
import java.util.Scanner;

public class findLargeNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=scan.nextInt();
		System.out.println("Enter the second number");
		int num2=scan.nextInt();
		int max=0;
		
		if(num1>num2) {
			max=num1;
			
		}else if(num2>num1) {
			max=num2;
			
		}else {
			max=num1;
		}
		System.out.println("Maximum number is "+max);		
		
	}

}
         


