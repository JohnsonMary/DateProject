package day29_Arrays_MultiD;

public class MultiDArrays {
	public static void main(String[] args) {
		
		int [][]nums=new int[2][3];
		
		nums[0][0]=10;
		nums[0][1]=20;
		nums[0][2]=30;
		
		nums[1][0]=40;
		nums[1][1]=50;
		nums[1][2]=60;
		
		int [][] nums2= { {10,20,30},{40,50,60},{70,80}};
		System.out.println(nums[0][0]);
		System.out.println(nums2[1][1]);
		System.out.println(nums2[2][1]);
		
		System.out.println("Number of arrays: "+nums.length);
		
		System.out.println("Number of values in first array "+nums[0].length);
		System.out.println("Number of values in second array "+nums[1].length);
		
        
		
		
		
		
	}

}
