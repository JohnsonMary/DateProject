package day12_ClassObject_Strings;

public class StringClass {
	public static void main(String[] args) {
		
		String name="Mary";
		
       System.out.println(name.toUpperCase());		
		
	   System.out.println(name.toLowerCase());

       System.out.println(name.length());	  
       System.out.println("java".length());
       
       System.out.println(name.charAt(0));

       
       if(name.charAt(0)=='M') {
    	   System.out.println("M is first letter");
    	   
       }else {
    	   System.out.println("M is not first letter");
       }
       
       
       char secondChar=name.charAt(1);
       System.out.println(secondChar);
		
	}

}


