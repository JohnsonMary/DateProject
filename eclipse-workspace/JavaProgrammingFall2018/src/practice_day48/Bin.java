package practice_day48;

import java.util.Arrays;

public class Bin {
	
	private String contents;
	private String type;
	
	
	public void setType() {
		this.type=type;
	}
	public Bin() {
		
		contents="";
		type="general";
	}
	public Bin(String type) {
		
		contents="";
		this.type=type;
		
	}
	public void add(String thing) {
		
		if(contents.isEmpty()) {
			
			contents=thing;
		}else{
			
			contents=contents+","+thing;
		}

	}
	public boolean remove(String thing) {
		
		thing=thing.toLowerCase();
		contents=contents.toLowerCase();
		
		if(contents.contains(thing)) {
			if(contents.startsWith(thing)) {
				contents=contents.replace(thing+",","");
				
			}else {

				contents=contents.replace(","+thing, "");

		    }return  true;
		
	   }else {
		   
		   return false;
	   }

  }
	
	public void empty() {
		
		contents="";
		
	}
	public String toString() {
		
		return "Bin "+type+" contains ["+contents+"]";
	}

		
}