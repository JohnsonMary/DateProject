package day59_Framework_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterables {
	public static void main(String[] args) {
		

		// LAST WAY OF ITERATING OVER A COLLECTION 
		// BE ABLE TO REMOVE WHILE ITERATING OVER 
		
		List<Integer> lst = new ArrayList<>(); 
		lst.add(12) ;
		lst.add(15) ;
		lst.add(20) ;
		
		Iterator<Integer> myIterator = lst.iterator();
//		System.out.println( myIterator.next() );
//		System.out.println( myIterator.next() );
//		System.out.println( myIterator.next() );
		
		System.out.println(  myIterator.hasNext()  );
		
		while( myIterator.hasNext() ) {
			
			int target = myIterator.next() ; 
			if(target>16) {
				myIterator.remove();
			}
			
		}
		System.out.println(lst);
		
		
		
		
		
		
		

	}

}

