package CodingTasks;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    int num;
	    int sum=0;
	    int num1=0;
	    int num2=0;
	    int num3=0;
	
	    
		for(int i=1; i<=3; i++) {
			 System.out.println("Enter number "+i+": ");
             num=scan.nextInt();
			    
		     if(i==1) {
				num1=num;	
					
				}else if(i==2) {
				num2=num;
					
				}else if(i==3) {
					num3=num;
					
				}
		}
		
		if(num1>num2 && num1>num3) {
				System.out.println("Largest number = "+num1);
				
			}else if(num2>num1 && num2>num3) {
				System.out.println("Largest number = "+num2);
				
			}else if(num3>num1 && num3 >num2) {
				System.out.println("Largest number = "+num3);
				
			  
			}	System.out.println("Sum= "+(num1+num2+num3));	
		
		
		
		
		
		
		
		
	}

}
