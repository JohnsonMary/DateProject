package Pratice7;
import java.util.Scanner;

public class AreaCode {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter phone number");
		String phoneNumber=scan.next();
		String areaCode="";
		String state="";
		
		if(phoneNumber.startsWith("(")) {
		areaCode=phoneNumber.substring(1,4);
			
		}else {
			areaCode=phoneNumber.substring(0,3);
		}
		
		
		switch (areaCode) {
		
		case "202":
			state="Washington DC";
			break;
		case "703":
			state="Virginia";
			break;
		case "209":
			state="California";
			break;
		case "312":
			state="Illinois";
			break;
		case "347":
			state="New York";
			break;
		default:
			System.out.println("ERROR: Not in database");
			break;
			
		}System.out.println("The state is "+state);
		
		
		
	}

}
