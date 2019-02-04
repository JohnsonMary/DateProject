package Practice_day_25;

public class SumOfArray2 {
	public static void main(String[] args) {
		
		int nums[]= {34,67,4,23,56};
		int sum=0;
		int sumOfEvens=0;
		int sumOfOdds=0;
		
		for(int n:nums) {
			sum+=n;
			
			if(n%2==0) {
				sumOfEvens+=n;
				
			}else {
				sumOfOdds+=n;
			}

			
		}System.out.println("The sum of even numbers: "+sumOfEvens);
		System.out.println("The sum of odd numbers: "+sumOfOdds);

		
		
		
		
		
	}

}
