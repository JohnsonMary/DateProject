package Practice4;

public class StringClass {
	public static void main(String[] args) {
		
        String school=new String("Chairs");
        
        System.out.println(school.toLowerCase());
        System.out.println(school.toUpperCase());
        System.out.println(school.length());
        System.out.println(school.charAt(3));
        System.out.println(school.charAt(4));
        System.out.println("Chairs".toUpperCase());
        
		
	    int count=school.length();
	    System.out.println("Count is "+count);
	    
	    char secondChar=school.charAt(1);
	    System.out.println(secondChar);
	    
		
		
	}

}
