package day28_ArrayUtil;

public class Found55 {
	public static void main(String[] args) {
		
		int [] numbers= {4,3,7,5,5,8};
		boolean result=false;
		
		for(int n=0; n<numbers.length;n++) {
			
			if(numbers[n]==5 && numbers[n+1]==5) {
				result=true;
				
				
			}

			
		}System.out.println(result);
		
		
		
	}

}
