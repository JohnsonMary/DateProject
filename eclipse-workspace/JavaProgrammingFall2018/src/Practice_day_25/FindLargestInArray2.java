package Practice_day_25;
import java.util.Scanner;

public class FindLargestInArray2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many items?");
		int count=scan.nextInt();
		
		
		int nums[]=new int[count];
		
		for(int i=0; i<count;i++) {
			System.out.println("Enter number "+(i+1));
			nums[i]=scan.nextInt();
			
		}
         for (int n:nums) {
        	 System.out.print(n+",");
         }
          int largest=nums[0];
          for(int k:nums) {
        	  
        	  if(k>largest) {
        		  largest=k;
        	  }

          }System.out.println();
          System.out.println("The largest number is "+largest);

		
		
		
		
		
		
		
	}

}
