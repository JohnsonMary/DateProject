package day23_StringReplace;

public class StringReplace {
	public static void main(String[] args) {
		
		String sentence = "We are learning Java";
		System.out.println(sentence);
		
		sentence = sentence.replace("Java", "C#");
		System.out.println(sentence);
		
		sentence=sentence.replace("a", "A");
		System.out.println(sentence);
		
		String word = "abansb java selenium";
		
		word=word.replace("ava", "unit");
		System.out.println(word);
		
		String result="123,4333,222 results";
		
		result=result.replace("results","").replace(",", "");
		System.out.println(result);
		
		
		
		
	}

}
