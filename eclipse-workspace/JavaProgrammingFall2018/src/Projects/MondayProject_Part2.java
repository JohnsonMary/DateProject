package Projects;
import java.util.Scanner;

public class MondayProject_Part2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a positive integer please");
		int n=scan.nextInt();
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(n+"x"+i+"="+(n*i));
			
		}
		System.out.println("--Question 1--");
		
		int counter=0;
		int nCounter=0;
		int zCounter=0;
		char b;
		
		do {
			System.out.println("Enter a number");
			int num=scan.nextInt();
			
			if(num>0) {
			 counter++;
				
			}
			if(num<0) {
			nCounter++;
				
			}
			
			if(num==0) {
			zCounter++;	
				
			}
			 System.out.println("Do you want to continue y/n?");
			 b=scan.next().charAt(0);
			 
			
	}while(b =='y');
		
		
		System.out.println("Positive numbers: "+counter);
		System.out.println("Negative numbers: "+nCounter);
		System.out.println("Zero numbers: "+zCounter);
	}

}
