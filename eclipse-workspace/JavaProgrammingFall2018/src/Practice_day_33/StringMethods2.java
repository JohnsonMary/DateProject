package Practice_day_33;

public class StringMethods2 {
	public static void main(String[] args) {
		
		
		System.out.println(counter("hello","l"));
		
		System.out.println(count("merhaba","b"));
		
		
	}

	public static int counter(String str1,String str2) {
		
		int counter=0;
		
		for(int j=0; j<str1.length();j++) {
			
			if(str1.charAt(j)==str2.charAt(0)) {
				
				counter++;
			}
		}return counter;

	}
	
	public static int count(String str1,String str2) {
		
		 int len1=str1.length();
		 
		 str1=str1.replaceAll(str2, "");
		 
		 int len2=str1.length();
		 return len1-len2;
		 
		
		
	}
	
	
}
