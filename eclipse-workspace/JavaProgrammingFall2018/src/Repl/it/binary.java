package Repl.it;

import java.util.Arrays;

public class binary {
	public static void main(String[] args) {
		
		int[] binary=new int[8];
	    int decimal=35;
	    for (int i=binary.length-1;i>=0;i--) {
	        binary[i]=decimal%2;
	        decimal/=2;
	    }
	    System.out.println(Arrays.toString(binary));
		
	}

	
	
}
