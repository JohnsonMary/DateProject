
package Practice_Repl_it;

import java.util.Arrays;

public class add_to_r {
	

	public static void add_to_r(int[] array,int num) {
		
		int[] newArray=new int [array.length+1];
		
		for(int i=0; i<array.length;i++) {
			
			newArray[i]=array[i];
			
		}
		newArray[newArray.length-1]=num;
		System.out.println(Arrays.toString(newArray));
		
	}
		

}
