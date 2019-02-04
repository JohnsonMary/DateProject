package day29_Arrays_MultiD;

import java.util.Arrays;

public class CarsMultiDArray {
	public static void main(String[] args) {
		
String[][]cars=new String[][] { 
		                      {"Toyota" , "Lexus" , "Acura" , "Nissan" },
		                      {"Audi" , "BMW" , "Porsche" , "VW" , "Mercedes" },
		                      {"Dodge" , "Tesla" , "Ford"  , "Jeep" , "Chevrolet" , "Corvette" , "Lincoln" },
		                      {"Ferrari" , "Fiat" , "Maserati", "Lamborghini" , "Alfaromeo" , "Lacia" }};
		
    for(int i=0; i<cars.length;i++) {
    	
    	switch(i) {
    	case 0:
    		System.out.println("Japanese: ");
    		break;
    	case 1:
    		System.out.println("German: ");
    		break;
    	case 2:
    		System.out.println("Italian: ");
    		break;
    	case 3:
    		System.out.println("American");
    		break;
    	default:
    		System.out.println("Unknown group");
    		break;
    	}
    	
    	for(int j=0; j<cars[i].length;j++) {
    		
    		System.out.print(cars[i][j]+",");
    	}
            System.out.println();
    }
		for(String []carGroup:cars) {
			
			
			for(String car : carGroup) {
				
				
				System.out.print(car+" ");
				
				
			}
			System.out.println();
		}
    
        int [] arr1= {7,5,4};
        
        System.out.println(Arrays.toString(arr1));
        int [] arr2=arr1;
        
        System.out.println(Arrays.toString(arr2));
    
    
		
		
		
	}

}
