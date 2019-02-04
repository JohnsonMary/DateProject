package Practice_day_20;
import java.util.Scanner;

public class warmUp2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=scan.nextLine();
		
		int num=0;
		
		while(num<=word.length()-1) {
			System.out.println(word.charAt(num));
			num ++;
		}
		
		
		
		
		
	}

}
