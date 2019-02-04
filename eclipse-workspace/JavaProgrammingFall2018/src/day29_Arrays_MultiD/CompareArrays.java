package day29_Arrays_MultiD;

import java.util.Arrays;

public class CompareArrays {
	public static void main(String[] args) {
		
		int arr1[]= {34,54,23,45,6};
		
		System.out.println(Arrays.toString(arr1));
		
		int [] arr2=arr1;
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr1==arr2);//true;
		System.out.println(Arrays.equals(arr1, arr2));//true;
		
		int arr3[]= {34,54,23,45,6};
		System.out.println(arr1==arr3);//false;
		System.out.println(Arrays.equals(arr1, arr3));
		
		String str1=new String("hello");
		String str2=new String("hello");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		
		
		
		
		
		 
		
		
		
		
	}

}
