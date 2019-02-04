package Practice17_Review;
import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Username please");
		String userName=scan.nextLine();
		System.out.println("Password please");
		String password=scan.nextLine();
		String secretUserName="admin";
		String secretPassword="admin123";

		
		if(userName.equals(secretUserName)&& password.equals(secretPassword)) {
			System.out.println("You logged in successfully!");
	    }else if((!userName.equals(secretUserName)&& !password.equals(secretPassword))){
				System.out.println("Invalid username and password!");
	    }else if(!userName.equals(secretUserName)) {
				System.out.println("Invalid Username");
				
		}else if(!password.equals(secretPassword)) {
				System.out.println("Invalid Password");
		     	
		}else {
			System.out.println("Invalid entry");

	}
		
		
	}

}
