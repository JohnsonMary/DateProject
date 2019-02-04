package Practice3;
import java.util.Scanner;

public class kms {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double kms=0.0;

		System.out.println("How many miles?");
		double miles=scan.nextDouble();
		
        kms=miles*1.61;
        
        System.out.println(miles+" miles is "+kms+" kilometers.");
		
		
		
		
	}

}
