package Practice3;
import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		if(num%5==0 && num%3==0) {
			System.out.println("FizzBuzz");
			
		}else if(num%3==0) {
			System.out.println("Fizz");
			
		}else if(num%5==0) {
			System.out.println("Buzz");
			
		}else {
			System.out.println(num);
		}
		
		
		

	
	}

}
