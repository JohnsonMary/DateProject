package Practice3;
import java.util.Scanner;

public class PriceChecker3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How much is the price?");
		int price=scan.nextInt();
		String status="";
		
		if(price>=1 && price<=50) {
			status="Cheap";
			
		}else if(price>=51 && price<=100) {
			status="Expensive";
			
		}else {
			status="not good to buy";
			
		}System.out.println("If the price is $"+price+" then,it is "+status);
		
		
		status=(price>=1 && price<=50)? "Cheap":(price>=51 && price<=100)?"Expensive":"Not good to buy";
		
		System.out.println(status);
		
		//////
		
		int year=2000;
		if((year%400==0) || (year%4==0 && year%100!=0)){
			System.out.println("It's leap year");
			
		}else {
			System.out.println("It's not a leap year!");
		}
		
		
		
		
		
		
		
		
	}

}
