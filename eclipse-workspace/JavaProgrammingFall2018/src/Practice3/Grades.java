package Practice3;
import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your grade:\n"+
		                   "gotA,gotB,gotC or gotD");
		String grade=scan.nextLine();
	     
		if(grade.equals("gotA")) {
			System.out.println("Great job!");
			
		}else if(grade.equals("gotB")) {
			System.out.println("Good!");
			
		}else if(grade.equals("gotC")) {
			System.out.println("Acceptable!");
			
		}else if(grade.equals("gotD")) {
			System.out.println("Fail!");
			
		}else {
			System.out.println("Invalid grade!");
		}
		
		///
		 grade="gotF";
		 
		String hello;
		
		hello=(grade=="gotA")?"Excellent":(grade=="gotB")?"Good!":(grade=="gotC")?"Acceptable!":(grade=="gotD")?"Fail":"Invalid grade";
		System.out.println(hello);
		
		
		
		
		
		
		
	}

}
