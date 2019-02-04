package Homework_ForLoops;
import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; ++i) 
		{
		     System.out.println( i);
		}
		
		for(int m=1; m<=101; m++) {
			
			System.out.print(m+" ");
		}

		System.out.println("--Question 1--");
		
		int sum=0;
		
	
		for(int s=1; s<100; s++) {
			
			System.out.print(s+"+");
			sum=sum+s;
			
			
		}System.out.print(100);
		 System.out.println("\n"+sum);
		
		System.out.println("--Question 3--");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please write a number");
		int num=scan.nextInt();
		
		for(int k=0; k<=10; k++) {
			
			System.out.print((num*k)+",");
			
		}
		   System.out.println("--Question 4--");
	   
		System.out.println("Please write a number");
		String number=scan.next();
		char ch0=number.charAt(0);
		     ch0='0';
		char ch1=number.charAt(1);
		     ch1='1';
		
        char numb=' ';		
		for (int j = 2; j <=number.length(); j++) {
			
			numb=number.charAt(j);
			numb=(char) (number.charAt(j)-2+number.charAt(j)-1);
			
			System.out.println(ch0+ch1+numb);
	}
		
		
		
		
		
		

		
		
		
		
		
		
		
		
	}

}
