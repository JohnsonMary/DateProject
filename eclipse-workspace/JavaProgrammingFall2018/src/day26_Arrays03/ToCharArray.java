package day26_Arrays03;

public class ToCharArray {
	public static void main(String[] args) {
		
		String word= "Hello";
		System.out.println(word);
		char []letters=word.toCharArray();
		
		
		for(char letter:letters) {
			
			System.out.print(letter);
			
		}
		
		String gift="Diamond Ring";
		
		char[] g=gift.toCharArray();
		
		for(int i =g.length-1;i>=0; i--) {
			
			System.out.print(g[i]+" ");
			
			
		}

		
		
		
		
	}

}
