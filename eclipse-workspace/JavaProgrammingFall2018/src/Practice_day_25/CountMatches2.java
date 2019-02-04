package Practice_day_25;

public class CountMatches2 {
	public static void main(String[] args) {
		
		double prices[]= {3,4,5,67,3,4,5,77,54,6,7,88,3};
		int count=0;
		
		
		for(double p:prices) {
			
			if(p>20) {
				count++;
		}
			

        }  if(count==0) {
			System.out.println("No items that costs $20"); 
        }
		
		System.out.println("There are "+count+" items over $20");
		
		
        
		
	}

}
