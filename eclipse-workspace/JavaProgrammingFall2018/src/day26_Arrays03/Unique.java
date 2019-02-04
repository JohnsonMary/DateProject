package day26_Arrays03;

public class Unique {
	public static void main(String[] args) {
		
		int nums[]= {1, 2, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4};
		for(int outer = 0; outer < nums.length; outer++) { //0
			int currentNum = nums[outer]; // 1
			
			boolean unique=true;
			
			
			for(int inner = 0; inner < nums.length; inner++) { //2
				
				if(nums[inner] == currentNum && outer != inner) {
					unique=false;
					break;
					
				}
			}
			
			if(unique) {
				System.out.print(nums[outer] + " ");
			}
	
		}
		
		
		
		
		
	}

}
