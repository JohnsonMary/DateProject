package Practice_day_25;
import java.util.Scanner;
import java.util.Random;

public class LargeArray2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many items in array");
		int n=scan.nextInt();
		Random random=new Random();
		
		int numbers[]=new int [n];
		
		for(int h=0; h<n; h++) {
		 numbers[h]=random.nextInt(100);
		 
		 System.out.print(numbers[h]+",");
		}
		
		
		
		
		
	}

}
