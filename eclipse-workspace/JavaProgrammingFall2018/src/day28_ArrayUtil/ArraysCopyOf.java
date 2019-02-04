package day28_ArrayUtil;

import java.util.Arrays;

public class ArraysCopyOf {
	public static void main(String[] args) {
		
		int[]a= {5,4,77};
		
		int[] b=Arrays.copyOf(a, 1);
		
		System.out.println(Arrays.toString(b));
		
		int [] c=Arrays.copyOf(a, 5);
		System.out.println(Arrays.toString(c));
		
		System.out.println("--------");
		
		System.out.println(Arrays.toString(c));
		
		a=Arrays.copyOf(a, 4);
		System.out.println(Arrays.toString(a));
		
		a[3]=100;
		
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
