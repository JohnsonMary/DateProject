package Practice17_Review;
import java.util.Scanner;

public class CountryName {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a country");
		String countryName=scan.nextLine();
		
		System.out.println(countryName.substring(0,2).toUpperCase() );
		
		System.out.println("Turkish \nEnglish \nAmerican");
		System.out.println("Turkish \nEnglish \nAmerican");
		
		
		
	}

}
