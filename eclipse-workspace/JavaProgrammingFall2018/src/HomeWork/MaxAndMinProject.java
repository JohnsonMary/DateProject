package HomeWork;
import java.util.Scanner;

public class MaxAndMinProject {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char yesNo=' ';
		int max=0;
		int min=0;
		
		do {
			
			System.out.println("Enter the number");
			int num=scan.nextInt();
			
			if(num>max) {
				
				max=num;
				
			}else {
				min=num;
			}
			
			System.out.println("Do you want to continue y/n?");
			 yesNo=scan.next().charAt(0);
			
			if(yesNo=='n') {
				
			System.out.println("The largest number is: "+max);
			System.out.println("The smallest number is: "+min);
			break;
				
		  }
			
		}while(yesNo=='y');
		
		
		
		
		
		
	}

}
