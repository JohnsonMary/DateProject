package Practice17_Review;
import java.util.Scanner;

public class HelloJava {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("First word");
		String A=scan.nextLine();
		System.out.println("Second word");
		String B=scan.nextLine();
		
		System.out.println(A.length()+B.length());
		
		if(A.charAt(0)>B.charAt(0)) {
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}
		char A2=A.charAt(0);
		char B2=B.charAt(0);
		
		String A1=A.substring(A.indexOf(A2),1).toUpperCase();
		String B1=B.substring(B.indexOf(B2),1).toUpperCase();
		
		
		System.out.println(A1+A.substring(1,A.length())+" "+B1+B.substring(1,B.length()));
		
		
		
		
	}

}
