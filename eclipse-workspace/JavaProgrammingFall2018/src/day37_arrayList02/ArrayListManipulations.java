package day37_arrayList02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListManipulations {
	public static void main(String[] args) {
		
		
		ArrayList <Integer> nums= new ArrayList<>(1000000);
		nums.add(4);
		nums.add(1,7);
		System.out.println(nums);
		String cities[]= {"Tokyo","Istanbul"};
		List<String> numsList=Arrays.asList(cities);
		System.out.println(numsList);
		
		
	}

}
