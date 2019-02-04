package HomeWork;

public class ArrayHas55 {
	public static void main(String[] args) {
		
		int nums[]= {1, 5, 5, 1, 1};

		boolean result=false;
        
		for(int x=0;x<nums.length-1;x++) {
            if(nums[x] == 5 && nums[x+1] == 5) {
                 result = true;
                break;
            }
        }
        System.out.println(result);




		  

		
		
		
		
	}

}
