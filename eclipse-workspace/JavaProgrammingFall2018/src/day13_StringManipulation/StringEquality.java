package day13_StringManipulation;

public class StringEquality {
	public static void main(String[] args) {
		
		String str1= "abc";
		String str2= "abc";
		
		System.out.println(str1==str2);//true
		
		System.out.println(str1.equals(str2));//true
		
		String str3=new String("abc");
		String str4="abc";
		
		System.out.println(str3==str4);//false
		System.out.println(str3.equals("abc"));//true
		
		String str5=new String ("abc");
		String str6=new String ("abc");
		System.out.println(str5==str6); //false);
		System.out.println(str5.equals(str6));//true
		System.out.println();
		
	
		
		
		
		
		
	}

}
