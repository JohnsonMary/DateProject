package Repl.it;

import java.util.ArrayList;

public class timesTwo {
	public static void main(String[] args) {
		
		ArrayList<Integer>nums=new ArrayList<>();
		nums.add(4);
		nums.add(6);
		nums.add(3);
		timesTwo(nums);
		
		
		
		
	}
	
	public static void timesTwo(ArrayList<Integer>nums){

		ArrayList<Integer> numbers=new ArrayList<>();

        for(Integer i=0; i<nums.size();i++){
			    
			  numbers.add(nums.get(i)*2) ; 
			  

        	
			  }System.out.println(numbers);
			  
		
  }
	public static ArrayList<Integer> test()
	{
		//write code here
		ArrayList<Integer>nums=new ArrayList<>();
	  
	  return nums;
			  
	}
} 