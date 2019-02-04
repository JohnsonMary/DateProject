package HomeWork;

import java.util.Arrays;

public class Zombies {
	public static void main(String[] args) {
		
	int [] inh= {3,6,0,4,3,2,7,1};	
	int [] cities  = {3, 6, 0, 4, 3, 2, 7, 1};
	int numDestroyed = 0;
	int numDay = 0;

	System.out.print("Day " + numDay + " ");
	System.out.println(Arrays.toString(cities));
	
	
	

	do {

		while (numDestroyed < cities.length) {
			
				for (int i= 0; i < cities.length; i++) {
					cities[i] /= 2;
					
					if (cities[i] == 0)
						numDestroyed++;
				}
				
			numDay++; 
			System.out.print("Day " + numDay+ " ");
			System.out.println(Arrays.toString(cities));
				
				if ( numDestroyed ==  cities.length) {
					break;
			}
	}
	
	}while (numDestroyed < cities.length );
	
	
	System.out.println("------------EXTINCT------------");
}   
 }  

	 
		 
		 
		 
	 
	 

		
		
		
		
		
	


