package day20_Loops03;

public class Accumulator {
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<=5; i++) {
			sum=sum+i;
			
		}
		
		System.out.println("Sum is "+sum);
		
		int sumOfOdds=0;
		int sumOfEvens=0;
		
		
      
        	
        	for(int n=0; n<=100; n++) {
        	
        		if(n%2==0) {
        		   sumOfEvens+=n;
        		   
        	}else {
        		sumOfOdds=sumOfOdds+n;
        		
        		
        	}
        		}
        		System.out.println("The sum of odds "+sumOfOdds);
        		System.out.println("The sum of evens "+sumOfEvens);
        		
        		
        		
        }
		
		
		
		
		
		
	}


