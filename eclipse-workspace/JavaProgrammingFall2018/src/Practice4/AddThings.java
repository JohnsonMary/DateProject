package Practice4;
import java.util.Scanner;

public class AddThings {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your username");
		String userName=scan.nextLine();
		
	    String domain="cybertekschool.edu";
		System.out.println(userName+domain);
		System.out.println(userName.concat(domain));
		
		////////
		
		String str=" blah hello";
		
		System.out.println(str.trim());
		System.out.println(str.length());
		System.out.println(str.trim().length());
		
		
		
		
		
		
		
		
		
	} 
	

}
