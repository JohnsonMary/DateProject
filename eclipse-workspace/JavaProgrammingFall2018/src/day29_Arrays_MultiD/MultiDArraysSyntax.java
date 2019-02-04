package day29_Arrays_MultiD;

import java.util.Arrays;

public class MultiDArraysSyntax {
	public static void main(String[] args) {
		
		
		double [][] prices=new double [3][];
		prices[0]=new double[] {234.4,234.56,788.45};
		prices[1]=new double[] {232.2,100.4};
		prices[2]=new double[5];
		prices[2][0]=543.34;
		prices[2][1]=4356;
		prices[2][2]=484733.3;
		prices[2][3]=5859;
		prices[2][4]=383.3;
		
		System.out.println(Arrays.toString(prices[0]));
		System.out.println(Arrays.toString(prices[1]));
		System.out.println(Arrays.toString(prices[2]));
		
		System.out.println(Arrays.deepToString(prices));
		
		
		
		
		
		
		
	}

}
