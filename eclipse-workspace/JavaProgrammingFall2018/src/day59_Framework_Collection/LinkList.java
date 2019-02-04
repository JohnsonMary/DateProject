package day59_Framework_Collection;

import java.util.*;


public class LinkList {
	public static void main(String[] args) {
		
		
		List<String> lst = new LinkedList<>(); 
		lst.add("ZWHITA");
		lst.add("RED");
		lst.add("BLUE");
		lst.add("YALLOWZ");
		System.out.println( lst );
		
		Iterator<String> lstIterator = lst.iterator();
		while(lstIterator.hasNext()) {
			
			String target = lstIterator.next() ; 
			
			if(target.contains("A") && target.contains("Z")  ) {
				
				lstIterator.remove();
				
			}
			
		}
		System.out.println( lst );
		
		
	}

}
