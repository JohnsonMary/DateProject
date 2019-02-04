package day19_Loops02;

public class Warmup2 {
	public static void main(String[] args) {
		
		String word="HelloWorld";
		
		word.substring(0,1).toUpperCase();
		System.out.println(word.substring(0,1).toUpperCase());
		System.out.println(word.substring(1).toLowerCase());
		word=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
		System.out.println(word);
		
		
		
		
	}

}
