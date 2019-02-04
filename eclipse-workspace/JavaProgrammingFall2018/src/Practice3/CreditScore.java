package Practice3;
import java.util.Scanner;

public class CreditScore {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your FICO Score");
		int score=scan.nextInt();
		String status="";
		int percentage=0;
		
		if(score<0 || score>850) {
			status="Invalid Score";
			percentage=0;
			
		}else if(score>=1 && score<=299) {
			status="Very bad";
			percentage=10;		
			
		}else if(score>=300 && score<=579) {
			status="Bad";
			percentage=16;
			
		}else if(score>=580 && score<=669) {
			status="Fair";
			percentage=18;
			
		}else if(score>=670 && score<=739) {
			status="Good";
			percentage=21;
			
			
		}else if(score>=740 && score<=799) {
			status="Very good";
			percentage=25;
			
		}else if(score>=800 && score<=850) {
			status="Exceptional";
			percentage=20;
		}
		
		System.out.println("status+percentage");
	}
	        
	
	} 

