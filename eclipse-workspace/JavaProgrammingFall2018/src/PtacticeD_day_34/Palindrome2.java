package PtacticeD_day_34;

public class Palindrome2 {
	public static void main(String[] args) {
		
		
		String word="civic";
		String reversed="";
		
		for(int i=word.length()-1;i>=0;i--) {
			
			reversed+=word.charAt(i);
			
		}System.out.println(reversed);
	
	if(reversed.equals(word)) {
		System.out.println("It's a palindrome");
		
	}else {
		System.out.println("It's not a palindrome");
	}

	}
}
