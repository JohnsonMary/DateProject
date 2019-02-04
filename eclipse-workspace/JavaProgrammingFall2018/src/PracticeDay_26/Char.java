package PracticeDay_26;

public class Char {
	public static void main(String[] args) {
		
		String word="Hello";
		
		char [] w=word.toCharArray();
		
		for(char l:w) {
			System.out.print(l+" ");
		}

		String gift="Diamond ring";
		
		char [] ch=gift.toCharArray();
		for(char c:ch) {
			System.out.print(c+" ");
		}

		for(int i=ch.length-1; i>=0;i--) {
			
			System.out.print(ch[i]+" ");
			
		}
		
		
		
		
		
		
	}

}
