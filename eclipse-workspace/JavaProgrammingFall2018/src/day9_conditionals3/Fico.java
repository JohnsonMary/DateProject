package day9_conditionals3;
import java.util.Scanner;

public class Fico {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Fico Score");
		int score=scan.nextInt();
		String condition;
		int percentage;
		
		if(score>=300 && score<=579) {
			condition="Very poor";
			percentage=16;
		}else if(score>=580 && score<=669) {
			condition="Fair";
			percentage=18;
		}else if(score>=670 && score<=739) {
			condition="Good";
			percentage=21;
			
		}else if(score>=740 && score<=799) {
			condition="Very good";
		    percentage=25;
			
		}else if (score>=800 && score<=850) {
			condition="Exceptional";
			percentage=20;
		}else if(score<0 || score>850){
			condition="Bad";
			percentage=10;
		}else {
			condition="Invalid Score";
			percentage=10;

		}
		System.out.println("Your credit status is "+condition);
        System.out.println("The percentage is "+percentage);		

	}
}

