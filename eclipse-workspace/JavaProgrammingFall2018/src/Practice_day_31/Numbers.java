package Practice_day_31;

public class Numbers {
	public static void main(String[] args) {
		
		System.out.println(sumToN(4));
		int sum=sumToN(6);
		System.out.println(sum);
		
	}
	
	public static int sumToN(int num) {
		int sum=0;
		
		for(int i=1; i<=num; i++) {
			
			sum=sum+i;
			
		}return sum;
		
		
	}

}
