package day28_ArrayUtil;

public class FirstAndLastLetters {
	public static void main(String[] args) {
		
		String [] words= {"hello", "why", "by", "apple" , "note"};
		
		
		for(int i=0; i<words.length; i++) {
			
		System.out.println(words[i].charAt(0)+""+words[i].charAt(words[i].length()-1));
			
		
	}
		
		System.out.println();
        for(String word:words) {
        	System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));
        	
        	
        	
        }
		
		
	
		
		
	}

	
}
