package day35_MethodReview;

public class HowManyTimes {
	public static void main(String[] args) {
		
		System.out.println( numberOfOccurences("hellooooo","o"));
		  

		System.out.println(delDel("adelola"));
		
	}

	public static int numberOfOccurences(String w1,String w2) {
		
		int counter=0;
		
		for(int i=0;i<w1.length();i++) {
			
			if(w1.charAt(i)==(w2.charAt(0))) {
				counter++;
			}

			
		}return counter;
		
		
		
	}
	public static String delDel(String str) {

	String s1="del";
	  
	  
	  if(str.substring(1,4).equals(s1)){
	    str=str.replace("del","");
	    return str;
	  }else{
	    return str;
	  }
	}
	
}
