package Practice1;
import java.util.Scanner;

public class DollarEuro {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("USD Amount");
		double usdMoney=scan.nextDouble();
		
		double usdToEuroExchangeRate=0.86;
		double euroToUsdExchangeRate=1.16;
		
		double euros=usdMoney*usdToEuroExchangeRate;
		System.out.println(usdMoney+" USD "+euros+" EURO ");
		
		System.out.println("EURO Amount");
		double euroMoney=scan.nextDouble();
		
		double dollars=euroMoney*euroToUsdExchangeRate;
		System.out.println(euroMoney+" EURO "+dollars+" USD ");
			
	}
	
	

}
