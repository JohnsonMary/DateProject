package Practice1;
import java.util.Scanner;

public class Temperature {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a fahrenheit value");
		int fahrenheit=scan.nextInt();
		
		double celcius=(5.0/9)*(fahrenheit-32);
		System.out.println("It is "+celcius+" celcius.");
				
				
		
	}

}
