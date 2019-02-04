package PtacticeD_day_34;

import java.util.Arrays;
import java.util.Random;

public class getIntArray5 {
	public static void main(String[] args) {
				
		
		int nums1 [] =getIntArray5();
		int nums2 [] =getIntArray5();
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		int sum1=0;
		int sum2=0;
		
		for(int n1:nums1) {
			sum1+=n1;
			
			
		}System.out.println("The sum of the first array is: "+sum1);
		for(int n2:nums2) {
			sum2+=n2;
			
		}System.out.println("The sum of the second array is: "+sum2);
	   
		if(sum1>sum2) {
	    	System.out.println(sum1+" is larger");
	    	
	    }else if(sum1>sum2) {
	    	System.out.println(sum2+" is larger.");
	    }
		
		
		
	}

	public static int [] getIntArray5(){
		
		int nums[]=new int[5];
		
		Random random=new Random();
		 for(int i=0;i<nums.length;i++) {
			 
			 nums[i]=random.nextInt(101);
			 
		 }return nums;
	} 
}
