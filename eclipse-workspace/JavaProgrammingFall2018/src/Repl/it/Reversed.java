package Repl.it;

public class Reversed {
	public static void main(String[] args) {
		System.out.println(isPalindrome("race car"));
		System.out.println(isPalindrome("hello"));
		

		
	}
	public static String reverse(String input)
	{
	  
	  String reversed="";
	  
	  for(int i=input.length()-1;i>=0;i--){
	    
	    reversed=reversed+input.charAt(i);
	    
	  }return reversed;
	   
	} 
	 public static boolean isError(String line) { 
	  
		String newLine[]=line.split(" ");
		
		if(newLine[0].equals("error")) {
			return true;
			
		}return false;
	 }
		
		public static boolean isPalindrome(String check) {
			String reversed="";
		    
		   check=check.replace(" ","") ;
		   
		   for(int i=check.length()-1;i>=0;i--) {
			   reversed+=check.charAt(i);
			   
			   if(reversed.equalsIgnoreCase(check)) {
				   return true;
			   }

			   
		   }return false;
		   
		   
		    
		  }
}
		 
	 
	  
	
		 
		 
		 

	

