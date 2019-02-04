package Practice_day_25;

public class SumOfArray {
	public static void main(String[] args) {
		int sum=0;
		int sumEvens=0;
		int sumOdds=0;
		
		int [] nums= {32,44,56,32,1};
		
		for(int n:nums) {
			sum+=n;
			
			if(n%2==0) {
				sumEvens+=n;
			}else {
				sumOdds+=n;
			}

			
		}System.out.println("Sum of all numbers is "+sum);
		System.out.println("Sum of even numbers is "+sumEvens);
		System.out.println("Sum of odd numbers is "+sumOdds);

		
		
		
		
	}

}
