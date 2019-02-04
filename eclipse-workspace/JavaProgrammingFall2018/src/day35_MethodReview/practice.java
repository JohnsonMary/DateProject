package day35_MethodReview;

public class practice {
	public static void main(String[] args) {
		
		System.out.println(in3050(40,50));
		
	}

	
	public static String at3(String target,String word){
		  
	      
	     String word1= target.substring(0,3)+word+target.substring(3);
	  
	    return word1;
	  }
	public static  boolean stringE(String str) {
		  boolean result=true;
		  
		  for(int i=1;i<=3.;i++){
		    
		    if(str.charAt(i)=='e'){
		    	
		      result=true;
		      break;
		      
		    }else{
		      
		      result=false;
		      break;
		    }

		    
		  }return result;
		  
		}
	public static boolean loneTeen(int a, int b) {
		
		  
		  boolean aTeen=(a>=13 && a<=19);
		  boolean bTeen=(b>=13 && b<=19);
		  
		  if((aTeen && !bTeen)|| (!aTeen && bTeen)) {
			  
			  return true;
			  
		  }return false;
		  
		  
		}
	public static boolean in3050(int a, int b) {
		  
		  
		  boolean a1=(a>=30 && a<=40);
		  boolean a2=(a>=40 && a<=50);
		  boolean b1=(b>=30 && b<=40);
		  boolean b2=(b>=40 && b<50);
		  
		  if((a1 && b1)||(a2 && b2)){
		    
		    return true;
		    
		 }return false;
		 
			
	}
}

