package Practice3;
import java.util.Scanner;

public class UsdToEur {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("USD amount");
		double usd=scan.nextDouble();
		double euro=0;
		double usdExchangeRate=0;
		System.out.println("What is the Usd Exchange Rate?");
		usdExchangeRate=scan.nextDouble();
		
		euro=usd*usdExchangeRate;
		
		System.out.println("If you have $"+usd+" then,you have "+euro+" Euro");
		
		
		
		
		
	}

}
