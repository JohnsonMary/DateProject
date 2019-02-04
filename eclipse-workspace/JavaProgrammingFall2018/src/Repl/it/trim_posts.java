package Repl.it;

public class trim_posts {
	public static void main(String[] args) {
		
		String[]  arr = new String[]{"abcde","12","bndh"};
	    
	    System.out.println(trim_posts(arr,4));
		
		
		
		
	}
	
	
	  public static StringBuilder trim_posts(String[] r,int size) {
		  
		  String posts="";
		  
		  for(int i=0; i<r.length;i++) {
			  
			  if(r[i].length()<=size) {
				  
				 posts+=r[i]+"<br>";
				  
				  
			  }
		  }
		  StringBuilder postsBuilder=new StringBuilder(posts);
		  return postsBuilder;
		  

		  
		  
	  }


}
