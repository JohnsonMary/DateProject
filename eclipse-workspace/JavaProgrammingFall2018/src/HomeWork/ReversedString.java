package HomeWork;

public class ReversedString {
	public static void main(String[] args) {
		
		String sentence="Java is fun";
		
		
		
		String[] splitted= sentence.split(" ");
		
		for(int n=splitted.length-1;n>0;n--) {
			
		System.out.print(splitted[n]+" ");
		
			
		
		}System.out.print(splitted[0]);

		
		
		
		
	}

}
