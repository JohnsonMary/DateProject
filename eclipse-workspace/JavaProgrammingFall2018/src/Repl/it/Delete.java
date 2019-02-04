package Repl.it;

import java.util.Arrays;

public class Delete {
	public static void main(String[] args) {
		
		int array[]= {2,3,4};
		System.out.println(Arrays.toString(deleteR(array,3)));
		
	}

	public static int[] deleteR(int[] arr,int element) {
	    
		int arr1[]=new int[arr.length-1];
		int j=0;
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]==element ) {
				
				
				continue;
			}
			arr1[j]=arr[i];
			j++;
			
		}return arr1;

		
	}	  

}
