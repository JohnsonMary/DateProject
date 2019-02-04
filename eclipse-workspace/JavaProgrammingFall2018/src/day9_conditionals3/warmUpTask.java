package day9_conditionals3;
import java.util.Scanner;

public class warmUpTask {
	public static void main(String[] args) {
		System.out.println("....I find number...");
		Scanner scan=new Scanner(System.in);
	    int num1,num2,num3,max;
		System.out.println("Enter 2 numbers");
		
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		if(num1>num2) {
			max=num1;
			
		}else {
			max=num2;
		}
		System.out.println("max: "+max);
		
		System.out.println("....I find the largest number...");
		System.out.println("Enter 3 numbers");
		
		num1=scan.nextInt();
		num2=scan.nextInt();
	    num3=scan.nextInt();
		
		if(num1>=num2 && num1>=num3) {
			max=num1;
			
		}else if(num2>=num1 && num2>=num3) {
			max=num2;
			
		}else if(num3>num1 && num3>num2){
			max=num3;
			
		}
			System.out.println("Max: "+max);
		
		    
		
		
		
		
		
		
	}

}
