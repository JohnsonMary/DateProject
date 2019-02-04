package day36_overloading_arraylist;

import java.util.ArrayList;

public class WrapperArrayListValues {
	public static void main(String[] args) {
		
		Integer n1 = 100;
		int n2=100;
		
		ArrayList <Integer>nums=new ArrayList<>();
		nums.add(300);
		nums.add(140);
		nums.add(3);
		nums.add(6372);
		
		System.out.println(nums);
		
		for(Integer n:nums) {
			
			System.out.println(n);
			
		}
		
		for(int i=0; i<nums.size(); i++) {
			
         System.out.print(nums.get(i)+" ");			
		}
		
		
		
	}

}
