package Practice_28;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		
		int nums[]= {90,78,33,32,3,0,-5};
		
		for(int i:nums) {
			System.out.print(i+" ");
			
		}System.out.println();
		
		Arrays.sort(nums,0,3);
		System.out.println(Arrays.toString(nums));
		
		
		
		
		
	}

}
