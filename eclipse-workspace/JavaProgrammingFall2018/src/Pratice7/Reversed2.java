package Pratice7;

public class Reversed2 {
	public static void main(String[] args) {
		
		int [] numbers= {3,8,5,1,7};
		
        for(int n:numbers) {
        	System.out.print(n);
        	
        	
        }
		System.out.println();
        for(int i=numbers.length-1; i>=0; i--) {
        	System.out.print(numbers[i]+",");
        	
        }
        
        int k=numbers.length-1;
        
        while(k>=0) {
        	
        	System.out.print(numbers[k]+" ");
        	k--;
        }

        
		System.out.println();
        for(int h=20; h>=1; h-- ) {
        
        	System.out.print(h+",");
        }

		
		
	}

}
