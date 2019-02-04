package day28_ArrayUtil;

import java.util.Arrays;

public class Evens {
	public static void main(String[] args) {
		int count=0;
		
		int nums[]= {2, 1, 2, 3, 4};
		
		for(int i=0;i<nums.length; i++) {
			
			if(nums[i]%2==0) {
				count++;
			}
				
			}System.out.println(count);

		}


}
