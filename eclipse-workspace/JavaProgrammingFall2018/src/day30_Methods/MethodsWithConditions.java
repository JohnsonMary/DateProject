package day30_Methods;

import java.util.Arrays;

public class MethodsWithConditions {
	public static void main(String[] args) {
		
		int n1=12;
		int n2=56;
		getLarger(12,56);
		
		int [] arr= {100,23,2};
		getMax(new int [] {23,43,22,3});
		
		steps(-6);
	
		
		
	}

	public static void getLarger (int n1,int n2) {
		
		int larger=0;
		if(n1>n2) {
			
			System.out.println(n1+" is larger.");
			
		}else if(n2>n1) {
			System.out.println(n2+" is larger.");
			
		}else if(n1==n2) {
			System.out.println("Numbers are equal "+larger);
		}


	}
	
	
	public static void getMax (int []nums ) {
		
		Arrays.sort(nums);
		
		if(nums.length==0) {
			System.out.println("ERROR: Array is empty");
			return;
			
		}
			
		System.out.println(nums[nums.length-1]);
		
		
		
		}
		
	public static void steps(int num) {
		

		if(num<0) {
			
			for(int j=-1;j>=num; j--) {
				System.out.println("Jump "+((-1)*j)+" times.");
				
		}
			
			
		}else if(num==0) {
			System.out.println("Sit");
			
		}else if(num>0) {
			
			for(int i=1;i<=num;i++) {
				System.out.println("Step "+i);
				
				}
			}
			
		}




	}
	
	
	
	
	





