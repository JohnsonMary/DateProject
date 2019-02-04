package HomeWork;

public class neighbourFives {
	public static void main(String[] args) {
		
		
		int [] nums= {1,5,5,1,1,};
		boolean doubleFive=false;
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i]==5 && nums[i]==nums[i+1]) {
				
				doubleFive=true;
				
				break;
			}
			
			}

		   System.out.println(doubleFive);
		}

		
	}


