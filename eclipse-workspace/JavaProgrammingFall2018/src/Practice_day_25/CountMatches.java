package Practice_day_25;

public class CountMatches {
	public static void main(String[] args) {
		
		double prices[]= {23,45,67,89,54,333,223,100,4,34,22,56};
		
		int count=0;
		
		for(double p:prices) {
			
			if(p>20) {
			count++;
			
			}
		}
            if(count==0) {
            	System.out.println("No items that costs more than $20");
            	
            	
            }else{
            	System.out.println("There are "+count+" items more than $20");
            	
            
            }         
			
	}
		
		
		
		
	}


