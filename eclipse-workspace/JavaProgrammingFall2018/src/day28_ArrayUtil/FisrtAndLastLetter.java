package day28_ArrayUtil;

import java.util.Arrays;

public class FisrtAndLastLetter {
	public static void main(String[] args) {
		
		String[] words= {"hello","why","by","apple","note"};
		String words2=" ";
		
		
		System.out.print("[");
        for(int i=0; i<words.length; i++) {
			
			
        words2=(words[i].substring(0,1)+words[i].substring(words[i].length()-1));
	    System.out.print(words2+","+" ");
		
			
			
		}
        System.out.println(words2.trim()+"]");





		
		
		
		
		
	}

}
