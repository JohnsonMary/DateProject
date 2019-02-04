package Practice17_Review;

public class StringSentence {
	public static void main(String[] args) {
		
		String sentence=new String("We are learning Java programming");
		
		int start=sentence.indexOf("learning");
		int end=sentence.indexOf("programming");
		
		System.out.println(start);
		System.out.println(end);
		
		String language=sentence.substring(start,end);
		System.out.println(language);
		System.out.println(language.trim());
		
		String name="Bengu";
		boolean num=name.startsWith("B");
		System.out.println(num);
		
		
	}

}
