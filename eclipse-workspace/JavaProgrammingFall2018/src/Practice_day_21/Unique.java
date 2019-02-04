package Practice_day_21;

public class Unique {
	public static void main(String[] args) {
		
		String word="aabcchsss";
			
		String w1="";
		
			
			
			for(int i=0; i<=word.length()-1; i++) {
				
				if(!w1.contains(word.substring(i,i+1))) {
					w1=w1+word.substring(i,i+1);
				
					
				}
			}System.out.println(w1);
		
			




		
		
		
	}

}
