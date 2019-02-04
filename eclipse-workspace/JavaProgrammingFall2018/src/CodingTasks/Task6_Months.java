package CodingTasks;
import java.util.Scanner;

public class Task6_Months {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=0;
		
		do {
			System.out.println("Please enter number of a month");
			 n=scan.nextInt();
			if(n>=1 && n<=12) {
				System.out.println("You entered a correct number!");
				
			}else {
				System.out.println("You entered an incorrect number!");
				
			}
			
		}while(!(n>=1 && n<=12));
		
		
		
		
		
	}

}
