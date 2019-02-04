package CodingTasks;
import java.util.Scanner;

public class Task5_TwoTimes {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word");
		String word=scan.nextLine();
		String w1="";
		
		for(int i=0; i<=word.length()-1; i++) {
			
			w1=word.substring(i,i+1)+word.substring(i,i+1);
			System.out.print(w1);
		}
			
		
		
		
		
		
		
	}

}
