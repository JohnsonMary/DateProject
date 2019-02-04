package day21_Loops04;

public class warmup {
	public static void main(String[] args) {
		
		String word="level";
		String reversed="";
		
		for(int idx=word.length()-1; idx>=0; idx--) {
			reversed=reversed+word.charAt(idx);
			
			
		}System.out.println(reversed);
		
		
		if(word.equals(reversed)) {
			System.out.println("Palindrome");
			
			
		}else {
			System.out.println("Not palindrome");
		}
		
		
	}

	
}
