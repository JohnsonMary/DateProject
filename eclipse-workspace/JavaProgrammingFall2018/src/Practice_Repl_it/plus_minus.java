package Practice_Repl_it;

public class plus_minus {
	
	public static void main(String[] args) {
		
		
		
		
	}
	
	public static void plus_minus(int [] nums) {

		int neg=0;
		int pos=0;
		int zero=0;
		for(int num:nums) {
			
			if(num<0) {
				neg++;
				
			}else if(num>0) {
				pos++;
				
			}else if(num==0) {
				zero++;
				
			}
			
		} System.out.println("positives: "+pos+" negatives: "+neg+" zero: "+zero);
		
	}		

}
