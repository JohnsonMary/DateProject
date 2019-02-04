package Repl.it;
import java.util.*;

public class removeInst {
	public static void main(String[] args) {
		
		
		
	}
	  public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n){
		  
		
		  
		  for(int i=0; i<r.size();i++) {
			  
			  if(r.get(i)==n) {
				  r.remove(r.get(i));
			  i--;
		 }
			  
		  }return r;
		  
		  
		  
		  
	  } 


}
