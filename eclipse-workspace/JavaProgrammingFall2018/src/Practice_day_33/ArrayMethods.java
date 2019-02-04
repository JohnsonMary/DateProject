package Practice_day_33;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(getArray5()));
		
		int larger;
	    int  arr1=addInArray();
	    System.out.println("The sum of the first array is "+arr1);
	    int  arr2=addInArray();
	    System.out.println("The sum of the second array is "+arr2);
	    if(arr1>arr2) {
	    	
	    	System.out.println("The sum of the first array "+arr1+" is larger.");
	    	
	    }else if(arr2>arr1) {
	    	System.out.println("The sum of the array "+arr2+" is larger");
	    }else {
	    	System.out.println("Both of the sum of the array are equal");
	    }

		
	}
	
	public static int [] getArray5() {
		
	int []  nums=new int[5];
		
	Random random=new Random();
	
	for(int i=0; i<nums.length;i++) {
		
		nums[i]=random.nextInt(101);
		
	}return nums;

	
	}
	public static int addInArray() {
	
	int sum=0;
	int arr1[]=getArray5();
	
	 for(int a:arr1) {
		 sum+=a;
		 
	 }return sum;
	 
	}
	
}
