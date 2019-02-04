package Practice5_Questions;
import java.util.Scanner;

public class LastTwo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=scan.nextLine();
		
		char w1=word.charAt(word.length()-1);
		char w2=word.charAt(word.length()-2);
		
		if(word.length()>=2) {
			System.out.println((word.substring(0,word.length()-2))+w1+w2);
			
		}
		
		
		
		
		
		
	

	
	}

}
