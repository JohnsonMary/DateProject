package Practice_day36;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		
		System.out.println(isAnagram("silent","listen"));
		
	}

	public static boolean isAnagram(String word1, String word2) {
	    
		word1=word1.toLowerCase();
		word2=word2.toLowerCase();
		
		char word1CharArray[]=word1.toCharArray();
		char word2CharArray[]=word2.toCharArray();
		
		Arrays.sort(word1CharArray);
		Arrays.sort(word2CharArray);
		
		if(Arrays.equals(word1CharArray, word2CharArray)) { 
			
			return true;
		}return  false;
			
			
			
	}
}

