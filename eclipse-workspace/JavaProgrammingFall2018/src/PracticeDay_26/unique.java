package PracticeDay_26;

public class unique {
	public static void main(String[] args) {
		
		int nums[]= {1,2,3,4,2,3,4,44,12,20,100,33,100,4};
		
		for(int o=0; o<nums.length; o++) {
	    
	    	boolean unique=true;
	    	int numbers=nums[o];
	    	
	    	for(int i=0; i<nums.length; i++) {
	    		
	    		if(nums[i]==numbers && o!=i) {
	    			unique=false;
	    			break;
	    			
	    			
	    		}

	    		
	    	}
	    	if(unique) {
	    		System.out.print(numbers+" ");
	    	}


	    }

		
		
		
		
		
	}

}




