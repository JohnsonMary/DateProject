package Practice_Day31;

import java.util.Arrays;

public class MT {
	public static void main(String[] args) {
		
		
		int [][]nums=new int [10][10];
		
		
		for(int i=1; i<10; i++) {

			for(int j=1; j<10;j++) {
				
				
				nums[i-1][j-1]=i*j;

			}
			}System.out.println(Arrays.deepToString(nums));
		
		
		
		
		
		
	}

}
