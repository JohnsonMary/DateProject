package PracticeDay_26;

import java.util.Arrays;

public class UniquesValues {
	public static void main(String[] args) {
		
		int nums[]= {1,2,3,4,2,3,4,44,12,20,100,33,100,4};
		
		
		
		for(int i=0; i<nums.length;i++) {
			int numbers=nums[i];
			boolean unique=true;
			
			for(int j=0; j<nums.length; j++) {
				
			   if(nums[j]==nums[i] && j!=i ) {
					unique=false;
					break;
					
			}

			}if(unique) {
				 System.out.print(numbers+" ");
			
				
			}
			
		}
		
		
		
		
		
		
		
	}

}
