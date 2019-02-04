package day20_Loops03;
import java.util.Scanner;

public class StringWord {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word");
		String w=scan.nextLine();
	
        int character=0;
        
        while(character<=w.length()-1) {
            System.out.println(w.charAt(character));
            character++;
        }
		
		
		
		
		
		
		
	}

}
