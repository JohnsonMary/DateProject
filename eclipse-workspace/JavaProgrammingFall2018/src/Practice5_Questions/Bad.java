package Practice5_Questions;
import java.util.Scanner;

public class Bad {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a word");
		String word=scan.nextLine();
		String w="bad";
		
		if((word.length()>=4)&& (word.startsWith(w))) {
			
		    System.out.println("True!");
		}else if((word.charAt(1)=='b')&&(word.charAt(2)=='a')&&(word.charAt(3)=='d')){
			System.out.println("TRUE!");
		}else{
			System.out.println("Invalid Entry!");
			
		}
		
		
		
		
		
		
	} 
	

}
