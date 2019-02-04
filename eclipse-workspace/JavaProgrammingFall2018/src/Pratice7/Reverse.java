package Pratice7;

public class Reverse {
	public static void main(String[] args) {
		
		String word="Happy";
		String reversed="";
		
		for(int i=word.length()-1; i>=0; i--) {
			reversed=reversed+word.charAt(i);
			
		}System.out.println(reversed);
		
		
		
		
	}

}
