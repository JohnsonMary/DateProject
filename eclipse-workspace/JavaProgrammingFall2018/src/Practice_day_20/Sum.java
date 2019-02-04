package Practice_day_20;

public class Sum {
	public static void main(String[] args) {
		
		
		int sum=0;
		for(int i=0; i<=5; i++) {
			sum=sum+i;
			
			
		}System.out.println("The sum is "+sum);
		
		
		int sumOfEvens=0;
		int sumOfOdds=0;
		int n=0;
		
		
	for( n=0; n<=10; n++) {
		if(n%2==0) {
			sumOfEvens=sumOfEvens+n;
			
	    }else if(n%2!=0) {
		        sumOfOdds=sumOfOdds+n;
		 
		} 
	}
	 System.out.println("The sum of evens "+sumOfEvens);
	 System.out.println("The sum of odds "+sumOfOdds);
		
		
	}

}
