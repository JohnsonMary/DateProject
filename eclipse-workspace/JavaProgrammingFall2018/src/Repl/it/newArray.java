package Repl.it;

public class newArray {
	public static void main(String[] args) {
		
		
		
	}

	 public static int[] addElements(int[] ints1, int[] ints2) {
		    
		  ints1=new int [] {10, 40, 50, 3, 1};
				 
		  ints2=new int [] {11, 0, 500, 44, 1101};
		 int  ints3[] =new int[5];
		  
		  for(int i=0; i<ints1.length;i++) {
			  
			ints3[i]  =ints1[i]+ints2[i];
			  
			 }return ints3;
		 
		  }
	  
	  public static String extractNum(String s) {
		
		  String all="";
		
		for(int i=0; i<s.length();i++) {
			
			for(char j='0';j<='9';j++) {
				if(j==s.charAt(i)) {
					
				all=all+s.charAt(i);
					
					
					
				}
				}
				
			}return all;

		}
		  
		   
	  
}
