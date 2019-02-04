package Practice_day_25;

public class FindSmallestInArray {
	public static void main(String[] args) {
		
		int nums[]= {34,2,21,66,87,900,23};
		int smallest=nums[5];
		
		for(int n:nums) {
			
			if(n<smallest) {
				
				smallest=n;
			}

			
		}System.out.println("The smallest number is: "+smallest);
		
		
		
		
	}

}
