package HomeWork;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {  
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		
	    if(num%num==0 && num%1==0 && num%2!=0 && num%3!=0) {
	    	System.out.println(num+ " is a prime number");
	    }
	    else {
	    	System.out.println(num+ " is not a prime number");
	    }
		
		
		
		
	}
}
