package Practice_28;

public class FirstAndLastLetters {
	public static void main(String[] args) {
		
		String words[]= {"hello", "why", "by", "apple" , "note"};
		
		for(String w:words) {
			
		    
		    
		    System.out.print(w.charAt(0));
		    System.out.println(w.charAt(w.length()-1));
			
		}
		for(String k:words) {
			
	   System.out.println(k.substring(0,1)+k.substring(k.length()-1));
			
		}
		for(int j=0; j<words.length;j++) {
			
			System.out.println(words[j].substring(0, 1)+words[j].substring(words[j].length()-1));
			
		}
		
		
	}

}
