package Practice5_OldTopics;
import java.util.Scanner;

public class UsdToEuro {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the USD amount");
		double usd=scan.nextDouble();
		System.out.println("Please enter the exchange rate");
		double rate=scan.nextDouble();
		double euro=usd*rate;
		
		System.out.println("If you have $"+usd+" then,you have "+euro+" Euro");
		
		
		
		
		
	}

}
