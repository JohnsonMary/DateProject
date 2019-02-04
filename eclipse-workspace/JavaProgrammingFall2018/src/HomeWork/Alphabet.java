package HomeWork;
import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Input an alphabet please");
		String letter=scan.next();
		char ch=letter.charAt(0);
		String vowels="AEIOUaeiou";
		
        if(letter.length()>1) {
        	System.out.println("ERROR:It must be one character only!");
        	return;
        }
		
		
		if((!(ch >= 'a' && ch<='z'))&&(!(ch>='A' && ch<='Z'))) {
		
			System.out.println("Error:The letter must be an alphabet character");
		    return;
		}
		
	

	    if(vowels.contains(letter)) {
			
			System.out.println("Input letter is a Vowel");
		
		}else {
		
			System.out.println("Input letter is a Consonant");
		}
		
		
		
		
		
		
		
	}

}
