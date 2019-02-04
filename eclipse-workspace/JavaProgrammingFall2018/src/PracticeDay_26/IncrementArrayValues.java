package PracticeDay_26;

public class IncrementArrayValues {
	public static void main(String[] args) {
		
		int nums[]= {1,2,3,4,5,6,7,8,9};
		
		for(int n:nums) {
			System.out.print(n+" ");
			
		}
		
	    for(int h:nums) {
	    	
	    	if(h%2==0) {
	    		h=h*2;
	    	}else {

	    		h=h*3;

	    }System.out.print(h+" ");
	    }
		

		
		
				
		
		
		
	}

}
