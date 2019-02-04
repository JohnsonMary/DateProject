package day17_Review2;
import java.util.Scanner;

public class Strings03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter a country name");
	    String countryName=scan.nextLine();
	    String abbreviated=countryName.substring(0,2).toUpperCase();
		
		System.out.println(abbreviated);
			
		
		//ternary condition
		
		System.out.println(abbreviated.length()==2 ? "2 chars detected": "2 chars were not found");
		String msg1="2 chars detected";
		String msg2="2 chars were not found";
		
		String result=abbreviated.length()==2?msg1:msg2;
		System.out.println(result);
		
		
	result=abbreviated.length()==2 ? abbreviated.charAt(0)=='U'? "Maybe USA": "Not USA":"2 chars were not found";
		
		System.out.println(result);
		
		
		
	}

}
