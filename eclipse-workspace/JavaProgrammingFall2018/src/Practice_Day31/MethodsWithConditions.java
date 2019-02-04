package Practice_Day31;

import java.util.Arrays;

public class MethodsWithConditions {
	public static void main(String[] args) {
	
		getMax(new int[] {32,44,54,5});
		
		int [] n= {3,2,1};
		getMax(n);
		
		
		
    

        
}

	public static void getMax(int nums[]) {
		
		int max=0;
		
		for(int n:nums) {
			
			if(nums.length==0) {
				System.out.println("Array is empty");
				return;
			
			}
		   
			
		}	Arrays.sort(nums);
		
		System.out.println(nums[nums.length-1]);

		
	}
	
	
	public static void getLarger (int num1,int num2) {
		
		if(num1>num2) {
			System.out.println(num1);
		}else if(num2>num1) {
			System.out.println(num2);
			
		}else {
			System.out.println("Numbers are equal: "+num1);
		}


		
		
		
	}
}
