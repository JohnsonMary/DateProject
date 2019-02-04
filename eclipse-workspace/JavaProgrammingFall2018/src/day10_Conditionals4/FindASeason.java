package day10_Conditionals4;
import java.util.Scanner;

public class FindASeason {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("What month?");
		
		int month=scan.nextInt();
		String season="";
		
		if(month==1 || month==2||month==12) {
			season="winter";
			
		}else if(month>=3 && month<=5) {
			season="spring";
		}else if(month==6||month==6||month==8) {
			season="summer";
			
		}else if(month==9||month==10||month==11) {
			season="fall";

		}System.out.println(season);
		
	}     

}

       
        	
        
