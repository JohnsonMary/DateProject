package Practice_day_20;
import java.util.Scanner;

public class Reverse02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word");
		String w=scan.nextLine();
		
		String reverse="";
		
		for(int c=w.length()-1; c>=0; c--) {
			reverse=reverse+(w.charAt(c));
			
			
		}System.out.print(reverse);
		
		
		
	}

}
