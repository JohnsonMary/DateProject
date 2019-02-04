package Repl.it;

public class Unique {
	public static void main(String[] args) {
		
		System.out.println(uniqueChars("hello"));
		
	}
	
	public static String uniqueChars(String word) {
		
	    String w1="";
		
		for(int i=0; i<word.length();i++) {
			
			if(!w1.contains(word.substring(i,i+1))) {
				
				w1=w1+word.substring(i, i+1);
			}

			
		}return w1;
		
		

		
		
		
		
		
	}

}
