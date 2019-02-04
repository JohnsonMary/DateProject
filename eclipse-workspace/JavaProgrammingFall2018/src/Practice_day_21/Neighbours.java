package Practice_day_21;

public class Neighbours {
	public static void main(String[] args) {
		
		String word="aabcch";
		
		for(int i =0; i< word.length()-1; i++) {
			
			if(word.charAt(i)== word.charAt(i+1)) {
			  System.out.println("beep- "+word.charAt(i));
				
			}
			
		}
		
		
		
		
		
	}

}
