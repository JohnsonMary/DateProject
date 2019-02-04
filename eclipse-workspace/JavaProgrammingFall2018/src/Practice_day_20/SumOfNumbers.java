package Practice_day_20;

public class SumOfNumbers {
	public static void main(String[] args) {
		
		int sum=0;
		
		
	    for(int l=1; l<=5; l++) {
			sum=sum+l;
			System.out.println("The sum is "+sum);
		}
		 int sumOfOdds=0;
		 int sumOfEvens=0;
	    
	    
		 	for(int k=0; k<=100; k++) {
			      
			   if(k % 2==0) {
		      sumOfEvens=sumOfEvens+k;

				   
			   }else if(k%2!=0) {
			 sumOfOdds=sumOfOdds+k;	  
				   
			   }
		 	}System.out.println("The sum odd is "+sumOfEvens);
			 System.out.println("The sum even is "+sumOfOdds);


		
		
		
	}

}
