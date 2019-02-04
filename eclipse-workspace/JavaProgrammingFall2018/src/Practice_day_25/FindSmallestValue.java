package Practice_day_25;

public class FindSmallestValue {
	public static void main(String[] args) {
		
		int number[]= {5,67,43,1,22,78};
		int smallest=number[2];
		
		for(int k:number) {
			if(k<smallest) {
				smallest=k;
			}

			
		}System.out.println("The smallest number is "+smallest);

		
		
		
		
		
	}

}
