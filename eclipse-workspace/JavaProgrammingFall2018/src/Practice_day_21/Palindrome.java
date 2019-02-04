package Practice_day_21;

public class Palindrome {
	public static void main(String[] args) {
		
		
		String word="hello";
		String reversed="";
		
		for(int i=word.length()-1; i >= 0; i--) {
			reversed=reversed+word.charAt(i);
			
		}System.out.println(reversed);
		if(word.equals(reversed)) {
			System.out.println("It's a palindrome");
			
		}else {
			System.out.println("It's not a palindrome");
		}
		
		
		
		
	}

}
