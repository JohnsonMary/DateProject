package Repl.it;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class isSort {
	public static void main(String[] args) {
		
		
		ArrayList <Double>nums=new ArrayList<>();
		nums.add(3.3);
		nums.add(5.5);
		nums.add(6.2);
		
		test(nums);
		
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

		
			
		
		
		
		
		
		
		
	}
	
	

	public static boolean isSort(int[] nums) {

		  for(int i=0; i<nums.length-1;i++) {
			  
			  if(nums[i]>nums[i+1]) {
				  return false;
			  }

		  }return true;


	  }
	  
	  public static String combineRs(String[] r1,String[] r2) {
		
		  String str="";
		 for(String r11:r1) {
			 
			 str=str+r11;
			 
		 } 
         for(String r11:r2) {
			 
			 str=str+r11;
		 
	  } return str;
         
    }
		public static void test(ArrayList<Double> dubs) {
			
			dubs.remove(0);
			dubs.remove(0);
			System.out.println(dubs);
			
			
			
		}
		
public static ArrayList<String> combineAL(ArrayList<String> wordList1,ArrayList<String> wordList2){

	ArrayList<String> wordList3=new ArrayList<>(wordList1);
	wordList3.addAll(wordList2);
	return wordList3;
	
	
	
			
			
		}
}