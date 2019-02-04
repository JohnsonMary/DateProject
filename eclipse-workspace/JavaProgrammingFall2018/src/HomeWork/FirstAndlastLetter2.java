package HomeWork;

import java.util.Arrays;

public class FirstAndlastLetter2 {
	public static void main(String[] args) {
		
		String [] words= {"hello", "why", "by", "apple" , "note"};
		String w=words[words.length-1];
		System.out.print("[");
		
		System.out.print(words[0].substring(0,1)+words[0].substring(words[0].length()-1)+",");
		
		for(int i=1; i < words.length-1; i++) {
			
		System.out.print(" "+words[i].substring(0,1)+words[i].substring( words[i].length()-1)+",");
		
		}System.out.print(" "+w.substring(0, 1)+w.substring(w.length()-1)+"]");
		
         

		
		
		
		
		
	}

}
