package Practice_day_20;
import java.util.Scanner;

public class PrintCharsWhileLoop {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word");
	    String word=scan.nextLine();
	    
	    int indx=0;
	    
	    while(indx<=word.length()-1) {
	    	System.out.println(word.charAt(indx));
	    	indx++;
	    	
	    	
	    }
		
		
		
		
		
	}

}
