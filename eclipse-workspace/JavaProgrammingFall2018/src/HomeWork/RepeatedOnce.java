package HomeWork;

import java.util.Arrays;

public class RepeatedOnce {
	public static void main(String[] args) {
		
		int [] nums= {1, 1, 2, 3, 4, 3, 4};
		
		Arrays.sort(nums);
        
		for(int i=0; i<nums.length ; i++) {
			
			if(i==nums.length-1) {
				System.out.println(nums[i]);
				break;
				
			}else if(nums[i]==nums[i+1]) {
				i++;
				
				
		}else {
			System.out.println(nums[i]);
			
		}
			
			
		}

		
	
	   } 
	
	}	
		
	

