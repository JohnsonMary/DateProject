package PtacticeD_day_34;

public class Palindrome {
	public static void main(String[] args) {
		
     System.out.println(reverse("hello"));
     
     String w1="google";
     String w2="civic";
     if(reverse(w2).equalsIgnoreCase(w2)) {
    	 System.out.println("It's a palindrome");
    	 
     }else {

    	 System.out.println("It's not a palindrome");
		
	}
	}	
	public static String reverse(String word) {
		
		String reversed="";
		
		for(int i=word.length()-1;i>=0 ;i--) {
			
			reversed=reversed+word.charAt(i);
			
			
	}return reversed;
	
	
}
	
}