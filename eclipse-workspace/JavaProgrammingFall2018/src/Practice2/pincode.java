package Practice2;
import java.util.Scanner;

public class pincode {
	public static void main(String[] args) {
		int pincode=145;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your pincode please");
		int code=scan.nextInt();
		
		if(code==pincode) {
			System.out.println("Access granted,welcome!");
			
		}else {
			System.out.println("Incorrect");
			System.out.println("Don't come again :)");
		}
		
	}

}
