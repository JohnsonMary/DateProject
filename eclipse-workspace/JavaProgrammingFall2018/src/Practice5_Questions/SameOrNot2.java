package Practice5_Questions;
import java.util.Scanner;

public class SameOrNot2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the fisrt word");
		String w1=scan.nextLine();
		System.out.println("Enter the second word");
		String w2=scan.nextLine();
		
		
		if(w1.charAt(0)+ w1.charAt(1)==(w2.charAt(w2.length()-1)) + (w2.charAt(w2.length()-2))) {
			
			System.out.println("True!");
			
		}else {
			System.out.println("False!");
		}
		
		
		
		
		
		
		
	}

}
