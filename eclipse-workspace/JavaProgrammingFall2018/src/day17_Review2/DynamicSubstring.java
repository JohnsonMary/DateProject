package day17_Review2;

public class DynamicSubstring {
	public static void main(String[] args) {
		
		String sentence="We are learning Python programming";
		
        int s1=sentence.indexOf("P");
        int s2=sentence.indexOf("p");
        String s3=sentence.substring(s1,s2);
		System.out.println(s3);
		
	}

}
