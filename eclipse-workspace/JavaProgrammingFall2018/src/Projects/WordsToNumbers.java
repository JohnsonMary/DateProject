package Projects;
import java.util.Scanner;

public class WordsToNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please choose a number:One,two,three,four,five,six,seven,eight,nine,ten");
		String num=scan.nextLine();
		
		if(num.equalsIgnoreCase("one")) {
			System.out.println(1);
			
		}else if(num.equalsIgnoreCase("two")) {
			System.out.println(2);
		}else if(num.equalsIgnoreCase("three")) {
			System.out.println(3);		
		}else if(num.equalsIgnoreCase("four")) {
			System.out.println(4);	
		}else if(num.equalsIgnoreCase("Five")) {
			System.out.println(5);
		}else if(num.equalsIgnoreCase("Six")) {
			System.out.println(6);
		}else if(num.equalsIgnoreCase("seven")) {
			System.out.println(7);
		}else if(num.equalsIgnoreCase("EIGHT")) {
			System.out.println(8);
		}else if(num.equalsIgnoreCase("Nine")) {
			System.out.println(9);
		}else if(num.equalsIgnoreCase("ten")) {
			System.out.println(10);
			
		}else {
			System.out.println("ERROR:Invalid number!");
		}
		
		
		}
		
		
		
	}
	
	
	
	
	


