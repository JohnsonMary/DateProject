package CodingTasks;
import java.util.Scanner;

public class Task_4_Prime {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
	
		
		if(num==2 || num==1) {
			System.out.println(num +" is a prime number");
			
		}
		
		for(int i=2; i<num; i++) {
			
			
			if(num%i==0) {
				System.out.println(num+" is not a prime number");
				break;
			}else {
				System.out.println(num+" is a prime number");
				break;
				
			}

			
			}
		
		
		
		

		
		
		
		
		
		
		
	}

}
