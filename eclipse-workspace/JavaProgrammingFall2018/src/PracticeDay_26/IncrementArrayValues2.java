package PracticeDay_26;

public class IncrementArrayValues2 {
	public static void main(String[] args) {
		
		int nums[]= {1,2,3,4,5,6,7,8,9};
		
		for(int n:nums) {
			System.out.print(n+" ");
		}
System.out.println();
		for(int i:nums) {
			
			if(i%2==0) {
				System.out.print((i*2)+" ");
				
		}else {
			System.out.print((i*3)+" ");
		}

		}

		
		
		
		
		
		
		
	}

}
