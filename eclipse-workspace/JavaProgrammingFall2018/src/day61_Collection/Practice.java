package day61_Collection;

import java.util.*;

public class Practice {
	public static void main(String[] args) {
//		TASK 1 : 
//		Given array of Strings names—> 
//		    Use iterator to iterate over.
//		    count unique elements 
//		    find out how many items start with  k-l
//		Optional    find frequency of each items  : hint create a frequency map 

		
		String[] arr = {"Darben","Pinkney","Lamburn",
				"Secretan","Kawse","Pinkney","Martynikhin",
				"Oram","Pinkney","Glaze","Martynikhin",
				"John","Adam","Zack"};
	
	List<String> nameLst = new ArrayList<>();
	for (String eachName : arr) {
		nameLst.add(eachName);
	}
	
	System.out.println(nameLst);
	
	Iterator<String> iter = nameLst.iterator();
	while(iter.hasNext()) {
		System.out.print(iter.next() + " ");
	}
	System.out.println();
	
	SortedSet<String> sSet = new TreeSet<>(nameLst);
	System.out.println(sSet);
	System.out.println(sSet.size());
	
	SortedSet<String> kpSet = sSet.subSet("K","Q") ; 
	System.out.println("kpSet1: "+kpSet);
	
	kpSet.remove("Oram") ;
	System.out.println("sSet: "+sSet);
	System.out.println("kpSet2: "+kpSet);
	
	
	Map<String,Integer> freqMap = new HashMap<>(); 
	
	System.out.println(  freqMap.containsKey( "ABC")    );
	
	
	for (String name : nameLst) {
		
		// add item to the map key and increment item by one 
		// if it appear in the list 
		
		if(  ! freqMap.containsKey(name) ) {
			
			freqMap.put(name, 1) ; 
			
		} else {
			
			Integer existingCount = freqMap.get(name) ;
			freqMap.put(name, existingCount + 1) ; 
			
		}

		
	}
	
	System.out.println( freqMap );
	

}

}