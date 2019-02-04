package practic_day_27;

import java.util.Arrays;

public class CopyValues {
	public static void main(String[] args) {
		
		String arr []= {"zero", "one", "two","three","four"};
		
		int count=0;
		
        for(String a:arr) {
        	
        	if(a.contains("e")) {
        		
        		count++;
        		
        		
        	}

        	
        }
           String fewValues[]=new String[count];
           System.out.println(count);
           
           int i=0;
           for(int k=0; k<arr.length; k++) {
        	   if(arr[k].contains("e")) {
        		   
        		   fewValues[i]=arr[k];
        		   i++;
        	   }
        	   
           }System.out.println(Arrays.toString(fewValues));
           for(String h:fewValues) {
        	   System.out.print(h+" ");
           }



		
		
		
		
	}

}
