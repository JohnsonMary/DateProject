package Practice2;
import java.util.Scanner;

public class findLargerNumber3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scan.nextInt();
        System.out.println("Enter second number");
        int num2=scan.nextInt();
        System.out.println("Enter third number");
        int num3=scan.nextInt();
        int max=0;
        
        if(num1>=num2 && num1>=num3) {
        	max=num1;
        	
        }else if(num2>=num1 && num2>=num3) {
        	max=num2;
        
        }else {
        	max=num3;
        	
          }
        System.out.println("Maximum number is "+max);
		
		
	}

}
