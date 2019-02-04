package Practice3;
import java.util.Scanner;

public class CreditScore2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your Fico score");
		int score=scan.nextInt();
		
		String status="";
	    int percentage=0;
	    
	      if(score<0 || score>850) {
	    	status="No credit";
	    	percentage=10;
	    
	      }else if(score >=1 && score<=299) {
		   status="Bad";
		   percentage=15;
	      }else if(score >=300 && score <=579) {
			  status="Very poor";
			  percentage=16;
	      }else if(score>=580 && score<=669) {
			  status="Fair";
			  percentage=18;
	      }else if(score>=670 && score<=739) {
			  status="Good";
			  percentage=21;
	      }else if(score>=740 && score <=799) {
		      status="Very good";
			  percentage=25;
	      }else if(score>=800 && score <=850) {
			  status="Exceptional";
			  percentage=20;
	     }
			System.out.println("If your Fico score is "+score+" then,your status is "+status+" and the percentage is %"+percentage);	
	
	}  
		

	}


