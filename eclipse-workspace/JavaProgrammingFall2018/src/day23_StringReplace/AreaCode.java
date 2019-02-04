package day23_StringReplace;
import java.util.Scanner;


public class AreaCode {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the phone number");
		String num=scan.nextLine();
		String areaCode="";
		
		
		if(num.startsWith("(")){
			areaCode=num.substring(1,4);
			
		}else {
			areaCode=num.substring(0,3);
		}
		
	     
		switch (areaCode) {
		
		case "202":
			System.out.println("Washington DC");
			break;
		case "703":
			System.out.println("Virginia");
			break;
		case "209":
			System.out.println("California");
			break;
		case "312":
			System.out.println("Illinois");
			break;
		case "347":
			System.out.println("New York");
			break;
		default:
			System.out.println("Not in database");
			
		}
		
		
	
		
		
		
		
		
	}

}
