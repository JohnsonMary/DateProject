package day28_ArrayUtil;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		
	int[] nums= {9,2,33,-7,5,23,11,90,7,66,34};
	
	for(int n:nums) {
		System.out.print(n+" ");
		
		
		
	}System.out.println();
	
	
	
    
	Arrays.sort(nums);

    for(int n:nums) {
	System.out.print(n+" ");
	
    }
		System.out.println();
		String names[]= {"Said","John","Asel","Alisiya","Mijat","Tariq","Z","Khalili"};
		
		Arrays.sort(names);
		
		for(String name:names) {
			System.out.print(name+" ");
			
		}
		char[] charArray= {'c','C','D','A','2'};
		
		Arrays.sort(charArray);
		
		System.out.println();
		
		for(char ch:charArray) {
			System.out.print(ch+" ");
		}

		
	}

}
