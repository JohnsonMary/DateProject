package HomeWork;

import java.util.Arrays;

public class SwapArray {
	public static void main(String[] args) {
		
		int [] nums= {4, 3, 2, 44, 1, 100, 55};
		
		int num;
		
		
       for(int i=0; i<nums.length/2; i++) {
    	   
    	   num=nums[i];
    	   nums[i]=nums[6-i];
    	   nums[6-i]=num;
    	   
    	}System.out.println(Arrays.toString(nums));
		
		
		
		
		
		
		
		
		
		
	}

}
