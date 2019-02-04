package Practice_day_25;

public class SearchInArray {
	public static void main(String[] args) {
		
		int [] nums= {21,55,34,67,100,4,23,45,77,87};
		boolean found=false;
		
		for(int j=0; j<=9; j++) {
			
			if(nums[j]==100) {
				System.out.println("Value found at index "+j);
				found=true;
				break;
				
			}
			
		}	
		    if(!found){

			System.out.println("100 not found in the array");
	}
		
		
	}

}
