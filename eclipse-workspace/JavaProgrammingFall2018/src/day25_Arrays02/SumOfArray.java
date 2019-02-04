package day25_Arrays02;

public class SumOfArray {
	public static void main(String[] args) {
		
		int nums[]= {34,2,35,66,900,6,23};
		int sum=0;
		int sumOfEvens=0;
		int sumOfOdds=0;
		
		for(int n:nums) {
			sum=sum+n;
			
			if(n%2==0) {
				sumOfEvens+=n;

			
		}else {
			sumOfOdds+=n;
		}
		
		
		}System.out.println("Sum of all numbers: "+sum);
		System.out.println("Sum of even numbers: "+sumOfEvens);
		System.out.println("Sum of odd numbers "+sumOfOdds);
	}

}
