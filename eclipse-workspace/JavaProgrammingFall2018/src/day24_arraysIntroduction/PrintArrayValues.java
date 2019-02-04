package day24_arraysIntroduction;

import java.util.Arrays;

public class PrintArrayValues {
	public static void main(String[] args) {
		
		String [] cars= {"Moskvich","Audi","Porsche","BMW","Toyota","Honda",
				         "Tesla","Dodge","Kia","Acura","Fiat",
				          "Cooper","Ford"};
		
		
		System.out.println(cars.length);
		
		int i = 0;
		System.out.println(cars[i]);
		i++;
		System.out.println(cars[i]);
		i++;
		System.out.println(cars[i]);
		
		for (int n =0; n<cars.length; n++) {
			
			System.out.println(cars[n]);
			
			
			// for EACH loop
			System.out.println("---FOR EACH LOOP---");
			
			for(String car :cars) {
			
				System.out.println(car);
	        }
			
			int [] nums= {4,6,3,1,4};
			
			for(int num:nums) {

				System.out.print(num+",");
			
			
			
			
			
		}
		
		}	
	}

	}
