package PracticeDay_29;

import java.util.Arrays;

public class CompareArrays {
	public static void main(String[] args) {
		
		int[] arr1= {56,23,656,67};
		
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2=arr1;
		
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr1==arr2);
		System.out.println(Arrays.equals(arr1, arr2));
		
		int [] arr3= {56,23,656,67};
		
		System.out.println(arr2==arr3);
		System.out.println(Arrays.equals(arr2, arr3));
		
		String str1=new String("hello");
		String str2=new String("hello");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		
		
		
	}

}
