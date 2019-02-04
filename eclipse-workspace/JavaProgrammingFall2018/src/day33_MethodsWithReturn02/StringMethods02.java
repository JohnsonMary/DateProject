package day33_MethodsWithReturn02;

public class StringMethods02 {
	public static void main(String[] args) {
		
		System.out.println(countTimes("addition","a"));
		
		
	}
	
	public static int countTimes(String str1,String str2) {
		
		int counter=0;
	
		for(int i=0; i<str1.length();i++) {
			
			
			if (str1.charAt(i)==str2.charAt(0)) {
				
				counter++;
			
			}
		}  return counter;

		
	}

	
}
