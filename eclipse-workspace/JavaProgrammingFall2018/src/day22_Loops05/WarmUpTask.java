package day22_Loops05;
import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many items did you purchase?");
		int num=scan.nextInt();
		String items="";
		
		double totalPrice=0;
		
		
		for(int i=1; i<=num; i++ ) {
			
			System.out.println("What's item "+i+" ?");
			 String name=scan.next();
			 
			 items=items+name;
			 
			
		  System.out.println("How much is "+name+" ?");
		  double price=scan.nextDouble();
		  totalPrice=totalPrice+price;
			 
			
		}System.out.println("Your items: "+items+",");
		System.out.println("Your total price: "+totalPrice);
		
		
		
		
		
		
		
	}

}
