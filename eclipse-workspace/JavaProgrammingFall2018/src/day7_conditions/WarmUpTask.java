package day7_conditions;
import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("USD Amount");
		double dollar=scan.nextDouble();
		double euro;
		euro=0.86*dollar;
		System.out.println("$"+dollar+" is "+euro+" EUR");
		
		System.out.println("EUR Amount");
		double money=scan.nextDouble();
		dollar=1.16*money;
		
		System.out.println(money+" EUR is $"+dollar);
		
		
		
		
		
		
		
	}

}
