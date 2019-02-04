package day13_StringManipulation;

public class StringPositions {
	public static void main(String[] args) {
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(alphabet.indexOf("A"));
	    int pPosition=alphabet.indexOf("P");
	    System.out.println(pPosition);
	    
	    
	    
	    System.out.println(alphabet.indexOf("HIJ"));
	    
	    String sentence="Today is Sunday and tomorrow is Monday.";
	    
	    System.out.println(sentence.indexOf("Sunday"));
	    System.out.println(sentence.indexOf("a"));
	    System.out.println(sentence.lastIndexOf("a"));
	    
        if(sentence.indexOf("and")>=0) {
        	System.out.println("Word is there");
        	
        }else {
        	System.out.println("Word is not there");
        }	    
	    	
        
	
		
		
		
		
		
	}

}
