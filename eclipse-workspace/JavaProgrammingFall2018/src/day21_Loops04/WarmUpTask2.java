package day21_Loops04;
import java.util.Scanner;

public class WarmUpTask2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word");
		String w=scan.next().toLowerCase();
		System.out.println("Enter a character");
		char c=scan.next().charAt(0);
		
	    
	    int counter=0;
	    
	    for(int i=0; i<= w.length()-1; i++) {
	    	
          if(w.charAt(i)==c) {
        	  counter++;
        	  
          } 
        	  
          
	    	
		}  System.out.println(counter);

		
		
		
		
		
		
	}

}
