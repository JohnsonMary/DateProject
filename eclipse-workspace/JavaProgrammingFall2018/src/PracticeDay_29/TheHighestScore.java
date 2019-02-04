package PracticeDay_29;
import java.util.Scanner;

public class TheHighestScore {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String name="";
		int score=0;
		int max=0;
		String maxName="";
		System.out.println("How many students are there?");
		int numberOfStudents=scan.nextInt();
		
		for(int i=1; i<=numberOfStudents; i++) {
			
			System.out.println("Enter the name of the "+i+". student");
			name=scan.next();
			System.out.println("Please enter the score of the "+name+"'s score");
			score=scan.nextInt();
			System.out.println(name+"'s score is "+score+".");
			
			if(score>max) {
				max=score;
				maxName=name;
			}else {
				max=max;
			}
			
		}System.out.println("The highest score is "+max);
		System.out.println(name+" has the highest score.");
		   
		

		     
		
				
		
		
		
		
		
		
		
	}

}
