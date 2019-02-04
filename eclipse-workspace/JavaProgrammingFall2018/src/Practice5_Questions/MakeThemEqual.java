package Practice5_Questions;
import java.util.Scanner;

public class MakeThemEqual {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first word");
		String w1=scan.nextLine();
		System.out.println("Enter the second word");
		String w2=scan.nextLine();
	    int word1=w1.length();
	    int word2=w2.length();

	    
		if(w1.length()==w2.length()) {
			System.out.println(w1+w2);
			
		}else if (word1>word2) {
			System.out.println(w1.substring(0,w1.length()-1)+ w2.substring(1));
			
		}else if(word2>word1) {
			System.out.println(w2.substring(0,w2.length()-1)+ w1.substring(1));
			
		}
		
		
		
		
		
		
	}

}
