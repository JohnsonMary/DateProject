package day28_ArrayUtil;

import java.util.Arrays;

public class EqualsArray {
	public static void main(String[] args) {
		
		
		int [] a= {10,20,30};
		int[] b= {10,20,30};
		int[]c= {10,20,30,40};
		int[] d= {10,20,40,30};
		
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
		
		boolean e=Arrays.equals(c, d);
		System.out.println(e);
		
		
		
		
		
		
	}

}
