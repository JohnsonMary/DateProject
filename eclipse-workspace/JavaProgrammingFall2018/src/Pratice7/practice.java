package Pratice7;

public class practice {
	public static void main(String[] args) {
		String str1="";
		 String str="happy";
		 
		  for(int i=0;i<str.length();i++){
		    
		    if(i==1){
		      
		     
		    }else{
		      str1=str1+str.charAt(i);
		      
		    }
		    
		  }System.out.println(str1);
		
	}

	public static  String missingChar(String str, int n) {
		  
		String str1="";
		 str="happy";
		 
		  for(int i=0;i<str.length();i++){
		    
		    if(i==n){
		      
		     
		    }else{
		      str1=str1+str.charAt(i);
		    }
		    
		  }return str;
		}

}
