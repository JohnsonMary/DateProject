package Repl.it;

import java.util.Arrays;

public class populate {
	public static void main(String[] args) {
		
		
		int nums[]=new int[3];
		nums=populate(nums);
		System.out.println(populate(nums));
		
	}

	public static int[] populate(int[] r) {

	int k=0;
	
	for(int i=1; i<=r.length;i++) {
		
		r[k]=i;
		k++;
		
	}
	  return r;
	
		
		
	
  }
}