package day48_inheritance02_super;

import java.util.ArrayList;

public class Bin {
	
	private String contents;
	private String type;
	
	

	public void setType(String type) {
		this.type = type;
	}
	
	
	public Bin() {
		this("general");
		//this.contents="";
		//this.type="general";
	}
	public Bin(String type) {
		
		this.type=type;
		this.contents="";
	}
	public void  add(String thing) {

		if(contents.isEmpty()) {
			
			contents=thing;
		}else {
			contents+=","+thing;
		}
		
	}
	public boolean remove(String thing) {

		String temp=contents.toLowerCase();
		thing=thing.toLowerCase().trim();
		
		if(temp.contains(thing)) {
			if(temp.startsWith(thing)) {
				temp=temp.replace(thing, "");
				temp=temp.isEmpty() ? temp:temp.substring(1);//to get rid of comma;
			}else {
				temp=temp.replace(","+thing, "");
			}
			contents=temp;
			return true;
			
		}else {
			
			return false;
		}

		
	}
	
	public void empty() {
		
		if(!contents.isEmpty()) {
			
			contents="";
		}

	}
	public String toString() {
		
		return "Bin ("+type+") contains ["+contents+"]";

		
		
	}
}
