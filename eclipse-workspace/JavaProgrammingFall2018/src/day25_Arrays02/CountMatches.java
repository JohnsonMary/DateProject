package day25_Arrays02;

public class CountMatches {
	public static void main(String[] args) {
		
		double prices[]= {24,54,34,20,10,3,77,5,34,87,54,70};
	    int count=0;
		
		for(double p:prices) {
			
			if(p>=20) {
				count++;
				System.out.print(p+",");
				
				
			}
	}     
		
		    if(count==0) {
		System.out.println("No items for more than $20");
		}else {
			System.out.println("\n"+count+" items with more than $20");
			
		}
		 
	

			
		
		
		
		
		
		
	}

}
