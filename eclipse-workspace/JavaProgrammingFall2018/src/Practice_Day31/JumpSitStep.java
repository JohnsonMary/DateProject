package Practice_Day31;

public class JumpSitStep {
	public static void main(String[] args) {
		
		
		steps(5);
		steps (-10);
		steps(0);
		
		
		
	}

	
	public static void steps(int num) {
		
		if(num<0) {
			for(int i=-1; i>=num;i--) {
				
				System.out.println("Jump "+(-1)*i+" times");
				
			}
			
	}else if(num==0) {
		System.out.println("Sit");
		
	}else if(num>0) {
		for(int j=0; j<=num; j++) {
			
			System.out.println("Step "+j);
		}

	}



		
		
	}
}
