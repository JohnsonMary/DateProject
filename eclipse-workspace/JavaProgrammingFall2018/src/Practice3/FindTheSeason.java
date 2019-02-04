package Practice3;
import java.util.Scanner;

public class FindTheSeason {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Which month?");
		
		int month=scan.nextInt();
		String season="";
		
		if(month==12||month==1||month==2) {
			season="winter";
			
		}else if(month>=3 && month<=5) {
			season="spring";
			
		}else if(month>=6 && month<=8) {
			season="summer";
			
		}else if(month==9||month==10||month==11) {
			season="fall";
			
		}else {
			System.out.println("Invalid month.1-12 accepted");
		}System.out.println("It is "+season+" season");
		
		
		
		
		
		
		
	}

}
