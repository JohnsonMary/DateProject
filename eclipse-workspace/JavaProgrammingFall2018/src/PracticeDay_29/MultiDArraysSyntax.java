package PracticeDay_29;

import java.util.Arrays;

public class MultiDArraysSyntax {
	public static void main(String[] args) {
		
		double [][]price=new double[3][];
		
		price[0]=new double[] {46.23,54.6,23.7};
		price[1]=new double[] {67.5,66.5};
		price[2]=new double[5];
		
		price[2][0]= 34.2;
		price[2][1]=44.3;
		price[2][2]=53.4;
		price[2][3]=545.34;
		price[2][4]=866.5;
		
		System.out.println(Arrays.toString(price[0]));
		System.out.println(Arrays.toString(price[1]));
		System.out.println(Arrays.toString(price[2]));
		
		
		
		
		
	}

}
