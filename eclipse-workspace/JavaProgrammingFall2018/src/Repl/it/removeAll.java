package Repl.it;
import java.util.*;

public class removeAll {
	public static void main(String[] args) {
		
		ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

		String targetWord="hi";
		removeAll(wordList,targetWord);
		

		
	}
	public static void removeAll(ArrayList<String> wordList,String targetWord){

		
		for(int i=0;i<wordList.size();i++) {
			
			if(wordList.get(i).equalsIgnoreCase(targetWord)) {
				
			    wordList.remove(targetWord);
			}

		
		}System.out.println(wordList);
		
		
		

	}
}
