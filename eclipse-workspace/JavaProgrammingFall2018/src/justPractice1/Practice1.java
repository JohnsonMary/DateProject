package justPractice1;

import java.util.*;

public class Practice1 {
	
	public static void main(String[] args) {
		
		String str = "Java is fun";
		String [] strSplitted = str.split(" ");
		
		for(int i = strSplitted.length-1; i>=0 ; i--) {
			
			System.out.print(strSplitted[i]+" ");
			
			
		}
		System.out.println();
		
		char first;
		char next;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please write a word");
		String word2 = scan.next().toLowerCase();
		
		for(int i =0; i<word2.length()-1; i++) {
			
			 first = word2.charAt(i);
			 next = word2.charAt(i+1);
			
			if(first==(next)) {
				System.out.println("Beep - "+first);
			}	
		}    
		

		
		
		
		
		String words[] = {"hello","why","by"};
		
		for(int i=0 ; i<words.length; i++) {
			
			System.out.println(words[i].charAt(0)+words[i].substring(words[i].length()-1));
			
		}
		
		String reverse = "";
		
		String word1 = "java";
				
		for(int i = word1.length()-1 ; i>= 0 ; i--) {
			
			reverse = reverse + word1.charAt(i);
			
	  } System.out.println(reverse );
	
		if(word1.equals(reverse)) {
			
			System.out.println("It's a palindrome");
			
		}else {
			System.out.println("It's not a palindrome");
		}
		
		
		
		System.out.println(frequencyOfChars(word1,'a'));
		
		System.out.println(uniqueChars("Johnson"));
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("First word");
		String w1 = input.next();
		System.out.println("Second word");
		String w2 = input.next();
		
		char [] w1Array = w1.toCharArray();
		char [] w2Array = w2.toCharArray();
		
		Arrays.sort(w1Array);
		Arrays.sort(w2Array);
		
		if(Arrays.equals(w1Array, w2Array)) {
			
			System.out.println("It's anagram");
		}else {
			System.out.println("It's not anagram");
		}

		
		
		
		
	}
	
	public static int frequencyOfChars(String str, char ch) {
		
	int count = 0;
		
		for( int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i)==(ch)) {
				
				count++;
		     }
			
		}
		
		
		return count;
	}
	
	public static String uniqueChars(String word) {
		
		String str ="";
		
		for(int i =0; i<word.length(); i++) {
			
			if(!str.contains(word.substring(i, i+1))) {
				
				str = str+ word.substring(i, i+1);
			}

		}  return str;

		
		
		
		
	}

	
	

}
