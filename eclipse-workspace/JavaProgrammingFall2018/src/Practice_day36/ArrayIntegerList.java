package Practice_day36;

import java.util.ArrayList;

public class ArrayIntegerList {
	public static void main(String[] args) {
		
		ArrayList <Integer> nums=new ArrayList<>();
		
		nums.add(122);
		nums.add(45);
		nums.add(84);
		System.out.println(nums);
		
		for(Integer n:nums) {
			System.out.println(n);
		}
		for(int i=0; i<nums.size();i++) {
			
			System.out.print(nums.get(i)+" ");
		}

		
		
	}

}
