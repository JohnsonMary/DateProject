package HomeWork;
import java.util.Scanner;

public class StringVariableSentence {
	public static void main(String[] args) {
		
		String sentence="Java is fun";
		//"fun is java"
		
		System.out.println("sentence -> "+sentence);
		
		String newSentence=(sentence.substring(sentence.lastIndexOf(" ")+1))+(" ")+(sentence.substring(sentence.indexOf(" ")+1,sentence.lastIndexOf(" "))+(" ")+sentence.substring(0,sentence.indexOf(" ")));
		System.out.print(newSentence);
		
	 

		
		
		
	}

}
