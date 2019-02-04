package CodingBat;

public class middleThree {
	public static void main(String[] args) {
		
		System.out.println(atFirst("hello"));
		
		
		
		
	}
	public String middleThree(String str) {
		  
	     if(str.length()>3){
	      str=str.substring(str.length()/2-1,str.length()/2+3);
	      
	  }else if(str.length()==3){
	    
	    str=str;
	    
	  }return str;
	}
	public static String atFirst(String str) {
		  
		  if(str.length()>2){
		    
		    str.substring(0,2);
		    
		  }else if(str.length()==2){
		    str=str;
		    
		  }else if(str.length()<2){
		    
		    
		    str=str.substring(0)+"@";
		    
		  
		  
		   }return str;
		}

}
