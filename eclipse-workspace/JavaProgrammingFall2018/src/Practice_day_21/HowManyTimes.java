package Practice_day_21;
import java.util.Scanner;

public class HowManyTimes {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Write a word");
		String word=scan.nextLine().toLowerCase();
		System.out.println("Write a letter");
		char letter=scan.next().toLowerCase().charAt(0);
		
		int counter=0;
		
		for(int i=0; i<= word.length()-1; i++) {
			
			if(word.charAt(i)==letter) {
				counter++;
				
			}
				
			
			
		}System.out.println(counter);
		
		
		
		
		
		
		
	}

}
