package day59_Framework_Collection;

import java.util.*;


public class Arraylist {
	
	public static void main(String[] args) {
		
	//  What did we learn so far 
		
		// Array -- [] 
		
		/*
		 *  Size :  once set can not be modified 
		 *  add or delete items after object is create
		 *  print directly 
		 * */
		
		int[] arr = {1,2,3} ; 
		System.out.println(arr);
		
		/*
		 *  we need to be able to resize the data structure 
		 *  				add or delete items 
		 *  				store only unique elements 
		 *  				first in first out or first in last out --
		 *  				
		 *  				<USA , 28> <UK , 20>  
		 * 
		 * */
		
		// TASK 1 : 
		/*
		 * Create an array list of String 
		 * add 5 items , iterate over it. 
		 * 
		 * Use Collection interface as reference type
		 * 
		 * */
		//ONLLY REFERENCE

		List<String> col = new ArrayList <>(); 
		
		col.add("apple"); 
		col.add("banana"); 
		col.add("orange"); 
		col.add("carrot"); 
		col.add("Kiwi"); 
		for(String each : col) {
			System.out.println(each);
			//Interview Question: What is the difference between ArrayList and LinkedList?
			
			col = new LinkedList<>();//First implementation to interface
			col.add("heydar");
			col.add("John");
			col.add("Serik");
			
			col.remove("John");
			
			System.out.println(col.get(1));
		
		}
		
	}
	}
