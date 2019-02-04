package day25_Arrays02;

public class SearchInArray {
	public static void main(String[] args) {
		
		
   int [] nums= {34,554,32,100,3,7,45,67,32,90};
   int lookFor=554;
   boolean found=false;
   
		
		for(int i=0; i<=nums.length-1; i++) {
			
			if(nums[i]==lookFor) {
				
				System.out.println(lookFor+" was found at index "+i);
				found=true;
				break;
				
						
			}
			
			
		}
		
		if(!found) {

		System.out.println(lookFor+" not found");
		
	}
	}
}
