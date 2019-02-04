package day25_Arrays02;

public class FindSmallestValue {
	public static void main(String[] args) {
		
		
		int sum=0;
		int nums []= {100,-200,0,234,345,-123};
		
		int smallest=nums[0];
		
		for(int n:nums) {
			
			sum=sum+n;
			
			if(n<smallest) {
				smallest=n;
				
			}
			
		}System.out.println("The smallest is: "+smallest);
		System.out.println(sum);
		
		
		
		
	}

}
