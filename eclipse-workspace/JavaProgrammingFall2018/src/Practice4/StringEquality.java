package Practice4;

public class StringEquality {
	
	public static void main(String[] args) {
		
		String str1="abc";
		String str2="abc";
		
		System.out.println(str1==str2);
		
		String str3=new String ("abc");
		String str4=new String ("abc");
		
		System.out.println(str3==str4);
		
		String str6=new String("abc");
		String str7=new String("abc");
		
		System.out.println(str6==str7);
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str7.equals(str6));
		
		
		
		
		
		
		
	}

}
