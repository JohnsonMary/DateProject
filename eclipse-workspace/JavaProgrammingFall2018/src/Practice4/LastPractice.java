package Practice4;

public class LastPractice {
	public static void main(String[] args) {
		
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println(alphabet.indexOf("A"));
		System.out.println(alphabet.indexOf("p"));
		System.out.println(alphabet.charAt(11));
		System.out.println(alphabet.toLowerCase());
	    
		int pPosition=alphabet.indexOf("P");
		System.out.println("P is at index "+pPosition);
		
		
		if(alphabet.indexOf("D")>=0) {
			System.out.println("Letter is there");
			
		}else {
			System.out.println("It's not there");
		}
		
	
		
		
		
	}

}
