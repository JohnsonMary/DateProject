package day22_Loops05;

public class NestedLoopExample {
	public static void main(String[] args) {
		
		
		for(int n=1; n <= 5; n++) {
		
		for(int i=1; i<=10; i++) {
			
			System.out.print(i+" ");
			
		}   System.out.println();
		
	}
		System.out.println("Outside the loop");
		
			
		for(int j=1; j <= 10; j++) {
			
			for(int i=1; i<=j; i++) {
				
				System.out.print(i+" ");
				
			}   System.out.println();
			
		}	
			
			for(int outer=10; outer>=1; outer--) {
				
				for(int inner= 1; inner<=outer; inner++) {
					System.out.print(inner+" ");
					
				}
				System.out.println();
			}
		  
		
		
		
		
		
		
		
	}

}
