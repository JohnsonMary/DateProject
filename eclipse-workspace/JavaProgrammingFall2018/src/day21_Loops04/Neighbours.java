package day21_Loops04;

public class Neighbours {
	public static void main(String[] args) {
		
		String n="";
		String word="aabcchffdd";
		
		for(int i=0; i<word.length()-1; i++) {
			 
			if(word.charAt(i)==(word.charAt(i+1))){
				
				System.out.println("beep- "+word.charAt(i));
			}
			
			
			
		}
		
		
	}

}
