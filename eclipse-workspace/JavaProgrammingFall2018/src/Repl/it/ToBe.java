package Repl.it;

public class ToBe {
	public static void main(String[] args) {
		
		StringBuilder stb=new StringBuilder("false,false");
		System.out.println(toBe(stb));
		
		
	}

	
	  public static boolean toBe(StringBuilder r) {
		  
		 
		  String rString=r.toString();
		  String[] rArray=rString.split(",");
		  
		  for(int i=0; i<=1;i++) {
			  
			  if(rArray[0].equalsIgnoreCase("false") && rArray[1].equalsIgnoreCase("false")) {
				  
				  return false;
			  }
		  }return true;
			  
			 
		  
		  
		  
		  
		  
	  }

	
	
}


		   
		    
		