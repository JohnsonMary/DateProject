package day26_Arrays03;

public class WarmUpTask {
	public static void main(String[] args) {
		
		int nums[]={1,2,3,4,5,6,7,8,9};
		
		for(int n:nums) {
			System.out.print(n+" ");
			
		}
		System.out.println();
		
		for(int i=0;i<=8;i++) {
			
			if(nums[i]%2==0) {
				
				nums[i]=nums[i]*2;
				
			}else {
            
				nums[i]=nums[i]*3;
				
			}System.out.print(nums[i]+" ");
			
			   
		}   
			
		
		
		
		
		
	}

}
