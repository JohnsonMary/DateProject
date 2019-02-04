package Repl.it;

public class replaceWith {
	
	
	  public StringBuilder replaceWith(String[] r,String replace,String replaceWith) {
		  
		  String all="";
		  for(int j=0;j<r.length;j++) {
			  
			  if(r[j].equalsIgnoreCase(replace)) {
				  
				  r[j]=replaceWith;
				  
			  }
			  all+=r[j];
			  
		 }StringBuilder allBuilder=new StringBuilder(all);
		 return allBuilder;
		  
		  
		  
	  } 


}
