package day33_MethodsWithReturn02;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {
	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(getIntArray5()));
		
		int myNums[]=getIntArray5();
		System.out.println(Arrays.toString(myNums));
		
		int myNums1[]=getIntArray5();
		int myNums2[]=getIntArray5();
		   
		   int sum1=0;
		   int sum2=0;
		   for(int i=0;i<myNums1.length; i++) {
			   
			  sum1+=myNums1[i]; 
			  
			   
		   }System.out.println(sum1);
		
		   for(int j=0; j<myNums2.length; j++) {
			   
			   sum2+=myNums2[j];
			   
			   
		   }System.out.println(sum2);
		
		if(sum1>sum2) {
			System.out.println(sum1);
		}else {
			System.out.println(sum2);
		}

		
		
		
	}
	
	   
	   
	   
	
	

	

	public static int[] getIntArray5() {
		
		int nums[]=new int [5];
		Random random=new Random();
		
		for(int i=0; i<nums.length; i++) {
			
			nums[i]=random.nextInt(101);
			
	}
			
	return nums;
	

	}

	     
	
	
	

}