package Repl.it;

import java.util.Arrays;

public class scalar {
	public static void main(String[] args) {
		
		 int [][] i= new int[][]
				  {
				   {1,1,1},
				   {1,1,1}
				  }; 
				  i = scalar(i,3);
				  System.out.println(Arrays.deepToString( i ));
				  
		
		
		
	}
	  public static int[][] scalar(int[][] matrix ,int n) {

		  for(int i=0; i<matrix[0].length;i++) {
			  
			  matrix[0][i]=matrix[0][i]*n;
			  
	  }
		  for(int k=0; k<matrix[1].length; k++) {
			  
			  matrix[1][k]=matrix[1][k]*n;
			  
		  }return matrix;

		  
	  }
}
