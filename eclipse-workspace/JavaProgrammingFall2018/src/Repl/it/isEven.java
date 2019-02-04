package Repl.it;

public class isEven {
	public static void main(String[] args) {
		 
		 
		String one="hello";
		String two="1234";
		String str1="";
		 String str2="";
		 
		 for(int i=0; i<one.length()-1;i++) {
			 
			 str1= one.substring(i,i+1);
			 
		 }
		 
		 for(int j=0; j<two.length()-1;j++) {
			 str2=two.substring(j, j+1);
			 
		 }
	    
		 String str=str1+str2;
		 System.out.println(str);
	 
	   }		
	
	
	 
 public static void   mergeStrings(String one, String two) {
	 String str1="";
	 String str2="";
	 
	 for(int i=0; i<one.length()-1;i++) {
		 
		 str1= one.substring(i,i+1);
		 
	 }
	 
	 for(int j=0; j<two.length()-1;j++) {
		 str2=two.substring(j, j+1);
		 
	 }
    
	 String str=str1+str2;
	 System.out.println(str);
 
   }
}
     
	 
 

		  
	  
			  

