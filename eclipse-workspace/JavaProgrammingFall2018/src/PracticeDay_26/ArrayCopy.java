package PracticeDay_26;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		
		String[] arr= {"zero","one","three","four","keys"};
		int counter=0;
		String words[]=new String [counter];
		
		for(String a:arr) {
			
			if(a.contains("e")) {
				counter++;
			}
			
			
		}
		
		String [] fewValues=new String[counter];
		int i=0;
		
		for(String a1:arr) {
			
			if(a1.contains("e")) {
				
				fewValues[i]=a1;
				i++;
			}

			
		} 
			System.out.println(Arrays.toString(fewValues));
	
			
		
		
		
		
	}

}
