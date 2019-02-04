package CodingTasks;
import java.util.Scanner;

public class Task8_CatDog2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please write a word");
		String word=scan.nextLine();
		
		String c="cat";
		String d="dog";
		int counter=0;
		int dCounter=0;
		
	  for(int i=0; i<=word.length()-3; i++) {
		  
		  if(word.substring(i,i+3).equals(c)) {
			  counter++;
	 }
		  if(word.substring(i,i+3).equals(d)) {
			  dCounter++;
	 }
		  
		  if(counter==dCounter) {
			  System.out.println("True");
			  
		  }
	  }   if(counter!=dCounter) {
		  System.out.println("False");
		  
	  }
	  
		
		
		
		
	}

}
