package Repl.it;
import java.util.*;

public class nanuk {
	public static void main(String[] args) {
		ArrayList<String>  arr = new ArrayList<String>();
	    arr.add("2");
	    arr.add("6");
	    arr.add("nanuk");
	    arr.add("nanuk");
	    
	  
	    boolean hunt = nanuk(arr,2,10);
	    if(hunt)
	    {
	      System.out.print("successful hunt");
	    }
	    else
	    {
	      System.out.print("this hunt is doomed");
	    }
	    
		
		
	}
	  public static boolean nanuk(ArrayList<String> r,int way_stones,int boast) {
		
		int counter=0;  
		int sum=0;
		int nanukCount=0;
		boolean flag=false;
		int intR1=0;
		
		for(String r1:r) {
			
			intR1=Integer.parseInt(r1);
			 sum+=intR1;
			 
			 if(r1.equals("nanuk")) {
				 nanukCount++;
			 }

		}

		
		for(int i=0; i<r.size();i++) {
		
		  
		if((sum>=boast && !r.get(i).equals("nanuk"))||(r.get(i).equals("nanuk")&& nanukCount>way_stones)) {
			
			flag=true;
			return true;
			

			
		}	  
		  
	  } return false;

		}
}
