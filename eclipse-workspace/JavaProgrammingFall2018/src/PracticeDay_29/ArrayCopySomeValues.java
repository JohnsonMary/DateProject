
package PracticeDay_29;

import java.util.Arrays;

public class ArrayCopySomeValues {
	public static void main(String[] args) {
		
		String arr []= {"zero","one","two","three","four","keys"};
		int counter=0;
		
		for(String a:arr) {
			
			if(a.contains("e")) {
				
				counter++;
			}
			}System.out.println(counter);
		
		String fewValues[]=new String[counter];
		
		int i=0;
		for(String arr1:arr) {
			if(arr1.contains("e")) {
				
				fewValues[i]=arr1;
				i++;
				
			}
			
		}System.out.println(Arrays.toString(fewValues));
		
		
 
		
		
		
		
		
		
		
	}

}
