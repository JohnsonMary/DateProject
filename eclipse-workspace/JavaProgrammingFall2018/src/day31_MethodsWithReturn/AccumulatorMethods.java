package day31_MethodsWithReturn;

public class AccumulatorMethods {
	public static void main(String[] args) {
		
		System.out.println(getStars(4));
		
		String myStars=getStars(6);
		System.out.println(myStars);
		int[] nums= {1,2,3,4,5,6,7,8,7,6,5,4,3,2,1};
		
		for (int n:nums) {
			System.out.println(getStars(n));
			
			
			
		}
		
		
		
	}

	public static String getStars (int num ) {
		
		String star="";
		
		for(int i=1; i<=num; i++) {
			
			star=star+"*";
			
		}

		 return star;
		
		
	}
	


}