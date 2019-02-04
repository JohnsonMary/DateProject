package Repl.it;

public class badP {
	public static void main(String[] args) {
		
		
		
	}
	
	  public static boolean badP(int[] products,int limit) {
		  
		  
		  int counter=0;
		  
		  for(int i=0; i<products.length;i++) {
			  
			  if(products[i]==0) {
				  
				  counter++;
				  
			  }
		  }

		  if(counter<limit) {
			  return true;
			  
		  }return false;

		  
		  
		  
	  }


}
