package Practice_day_33;

public class StringMethods {
	public static void main(String[] args) {
		
		String reversed=reverse("java");
		System.out.println(reversed);
		
		System.out.println(isPalindrome("civic"));
		System.out.println(isPalindrome("happy"));
		
		
	}

	public static String reverse(String word) {
		
		String reversed="";
		
		for(int i=word.length()-1;i>=0;i--) {
			
			reversed+=word.charAt(i);
			
		}return reversed;
		
		
		
		
		
	}
	
	public static boolean isPalindrome (String word) {
		
		if(word.equalsIgnoreCase(reverse(word))) {
			
			System.out.println("It's a palindrome");
			
			return true;
		}
			
			System.out.println("It's not a palindrome");
			return false;
		


		
	}
	
}
