package HomeWork;

import java.util.Arrays;

public class MultiplicationTable {
	public static void main(String[] args) {
		
		
		int [][]multiplicationTable= new int [10][10];
		for(int r=1; r<=10; r++) {
			for(int c=1; c<=10; c++) {
				
		multiplicationTable[r-1][c-1]=r*c;
				
				
				
			}
		}System.out.println(Arrays.deepToString(multiplicationTable));		

		
		
		
		
	}

}
