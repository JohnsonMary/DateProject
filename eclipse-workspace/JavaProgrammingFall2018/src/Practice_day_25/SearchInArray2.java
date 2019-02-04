package Practice_day_25;

public class SearchInArray2 {
	public static void main(String[] args) {
		
		int  nums[]= {3,55,34,21,1,66,789,4,3,2};
		boolean found=false;
		
		for(int n=0;n<9;n++) {
			if(nums[n]==100) {
				System.out.println("Value found that index "+n);
				found=true;
				break;
				
			}

		}if(!found) {
			System.out.println("100 couldn't found");
			
		}
			
		
		
		
		
		
	}

}
