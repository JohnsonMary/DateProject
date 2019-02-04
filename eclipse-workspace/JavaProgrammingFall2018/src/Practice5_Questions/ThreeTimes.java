package Practice5_Questions;
import java.util.Scanner;

public class ThreeTimes {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word");
		String word=scan.nextLine();
		
		
	    if(word.length()>=2) {
	    	System.out.println(word.substring(0,2)+word.substring(0,2)+word.substring(0,2));
	    	
	    }
		
		
	}

}
