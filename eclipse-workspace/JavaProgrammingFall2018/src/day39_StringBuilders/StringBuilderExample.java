package day39_StringBuilders;

public class StringBuilderExample {
	public static void main(String[] args) {
		
		StringBuilder stb1=new StringBuilder("Halloween");
		System.out.println(stb1);
		
		StringBuilder stb2=new StringBuilder();
		stb2.append("Java");
		System.out.println(stb2);
		stb2.append(",Selenium").append(",Html");
		System.out.println(stb2);
		
		StringBuilder listBuilder=new StringBuilder("Wooden Spoon");
		listBuilder.append(",iron spoon");
		System.out.println(listBuilder);
		
		listBuilder.append('|');
		System.out.println(listBuilder);
		
		listBuilder.append(100);
		System.out.println(listBuilder);
		
		String s="aaa";
		s=s+100;
		
		StringBuilder letters=new StringBuilder("ABCDEFGHIJKLM");
		
		letters.append("KKK WW");
		System.out.println(letters);
		
		letters.delete(0, 4);
		System.out.println(letters);
		
		letters.delete(5, 10);
		System.out.println(letters);
		
		StringBuilder stb7=new StringBuilder("Java is fun!");
		System.out.println(stb7);
		
		stb7.reverse();
		System.out.println(stb7);
		
		stb7.deleteCharAt(0);
		System.out.println(stb7);
		
		stb7.deleteCharAt(stb7.length()-1);
		System.out.println(stb7);
		
		StringBuilder stb=new StringBuilder("keyboard");
		stb.insert(3, "-");
		System.out.println(stb);
		
		StringBuilder hello=new StringBuilder("SeleniumAutomation");
		hello.insert(8, " Test ");
		System.out.println(hello);
		
		hello.insert(9,1);
		System.out.println(hello);
		
		hello.replace(9, 14, "Engineer");
		System.out.println(hello);
		
		String str2="aabbaajj";
		str2=str2.replace("aa", "ww");
		System.out.println(str2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
