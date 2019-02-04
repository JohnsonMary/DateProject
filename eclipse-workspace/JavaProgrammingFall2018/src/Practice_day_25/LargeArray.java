package Practice_day_25;
import java.util.Scanner;
import java.util.Random;

public class LargeArray {
	public static void main(String[] args) {
		Random random=new Random();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many items in array?");
		int count=scan.nextInt();
		
        int nums[]=new int[count];
        
        for(int i=0; i<count; i++) {
        	
        	nums[i]=random.nextInt(100);
        	
        	
        }
        for(int n:nums) {
        	System.out.print(n+",");
        	
        }
		
		
		
		
		
		
		
	}

}
