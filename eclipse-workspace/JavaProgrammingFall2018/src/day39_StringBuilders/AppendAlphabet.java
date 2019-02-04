package day39_StringBuilders;

public class AppendAlphabet {
	public static void main(String[] args) {
		
		
		char ch ='A';
		ch++;
		System.out.println(ch);
		StringBuilder letters=new StringBuilder();

		
		for(char chars='A'; chars<='Z'; chars++) {
					
			letters.append(chars);
			
		}System.out.println(letters);

		
		
		
	}

}
