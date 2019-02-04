package day33_MethodsWithReturn02;

public class StringMethods {
	public static void main(String[] args) {
		
		System.out.println(reverse("Merhaba"));
		
		System.out.println(isPalindrome("hello"));
		
		boolean isPal=isPalindrome("level");
		System.out.println(isPal);
		
		String word="java";
		
		if(isPalindrome(word)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It's not a palindrome");
		}

		
		
	}

	public static String reverse (String str) {
		
		
		String reversed="";
	     
		
		for(int i=str.length()-1;i>=0;i--) {
			
			 reversed=reversed+str.substring(i,i+1);
			
		}
		return reversed;
		
	}
	
	public static boolean isPalindrome (String str) {
		
		
		 String reversed="";
		 
		 for(int j=str.length()-1;j>=0;j--) {
			 
			 reversed=reversed+str.charAt(j);
		 }
		 
		 if(str.equalsIgnoreCase(reversed)) {
			 
			 return true;
		 }else  {
			 
		 }return false;
		 
		 }
		 

		public static boolean isPalindromeV2(String str) {

			
			if(reverse(str).equalsIgnoreCase(str)) {
		           
				return true;
	       
			}return false;
	        
	        
	    }
			
			
			
			
			}
	


