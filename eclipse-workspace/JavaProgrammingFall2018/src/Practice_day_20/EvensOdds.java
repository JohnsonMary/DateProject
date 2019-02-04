package Practice_day_20;

public class EvensOdds {
	public static void main(String[] args) {
		int sumOfEvens=0;
		int sumOfOdds=0;
		
		for(int n=0; n<=10; n+=2) {
			sumOfEvens=sumOfEvens+n;
			
		}System.out.println("The sum of evens "+sumOfEvens);
		
		for(int m=1; m<=10; m+=2) {
			sumOfOdds=sumOfOdds+m;
			
		}System.out.println("The sum of odds "+sumOfOdds);
		
	}

}
