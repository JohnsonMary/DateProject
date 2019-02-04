package Repl.it;

import java.util.*;

public class mergR {
	public static void main(String[] args) {
		
		int[]a= {2,3,4};
		int b[]= {5,6,7};
		System.out.println(mergR(a,b));
		
		String abc[]= {"n","a","a","a"};
		System.out.println(getDup(abc));
		
		
	}
	  public static int[] mergR(int[] a,int[] b) {

			   int[] mer = new int[a.length + b.length];
			   int z = 0;
			   for(int i = 0 ; i < a.length ; i ++){
			     mer[z] = a[i];
			     z++;
			   }
			  for ( int k = 0 ; k < b.length ; k++){
			    mer[z] = b[k];
			    z++;
			  }
			   return mer;
			 }
		  
		  
	  public static int getDup(String[] r) {
		  
		  int counter=0;
		  
		  for(int i=0; i<r.length;i++) {
			  
			  for(int k=0; k<r.length;k++) {
				  
				  if((r[i].equals(r[k])) && i!=k) {
					  
					  counter++;
					  
					  
				  }
			  }

		  }return counter;

		  
		  
		  
	  }

}
