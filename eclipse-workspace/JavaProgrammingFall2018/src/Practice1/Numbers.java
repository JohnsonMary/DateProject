package Practice1;
import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int first=scan.nextInt();
		System.out.println("Enter second number");
		int second=scan.nextInt();
		System.out.println("Enter third number");
		int third=scan.nextInt();
		
		int sum=first+second+third;
		System.out.println("If first number is "+first+" ,second number is "+second+" ,third number is "+third+" then,the total is "+sum+".");
			
			
		
	}

}
