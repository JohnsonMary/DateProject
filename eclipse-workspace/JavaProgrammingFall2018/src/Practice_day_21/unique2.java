package Practice_day_21;

public class unique2 {
	public static void main(String[] args) {
		
		String w1="";
		String word="happy";
		
		for(int i=0; i<= word.length()-1; i++) {
			
			if(!w1.contains(word.substring(i,i+1))) {
				w1+=word.substring(i,i+1);
				
			}

			
		}System.out.println(w1);
		
		
		
		
		
	}

}
