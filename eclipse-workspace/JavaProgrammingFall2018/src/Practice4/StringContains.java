package Practice4;

public class StringContains {
	public static void main(String[] args) {
		
		String word="water";
		
		System.out.println(word.startsWith("w"));
		System.out.println(word.endsWith("r"));
		System.out.println(word.startsWith("l"));
		
		System.out.println(word.length());
		System.out.println(word.toUpperCase());
		System.out.println(word.toLowerCase());
        System.out.println(word.contains("at"));
        System.out.println(word.isEmpty());
        System.out.println(word.charAt(2));
///////
        
        String name="Entertainment";
        
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("r"));
        System.out.println(name.indexOf("m"));
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf("a"));
        System.out.println(name.charAt(9));
        System.out.println(name.charAt(11));
        System.out.println(name.contains("ta"));
        System.out.println(name.length());
        System.out.println(name.lastIndexOf("e"));
        System.out.println(name.lastIndexOf("t"));
        System.out.println(name.indexOf("e",4));
        System.out.println(name.indexOf("n",9));
       
        
        
		
		
		
		
	}

}
