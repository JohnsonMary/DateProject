package day61_Collection;

import java.util.*;
import java.util.Map.Entry;

public class MapPractice2 {
	public static void main(String[] args) {
		
		/*
		 * TASK 2 : 
    create a new class 
    copy your list that contains all the names from previous task 
    
    Create a hashmap of String and Integer 
    store each names as a key and length of each names as a value 
    
    Get 3 views out of your map  --> keySet  , values , entrySet 
    Iterate over in 3 loops 
    
    Optionally 
    remove key that start with P   --> using keyset view 
    remove any words that have length of 6  --> using values view 
    update the value of entry if the value is more than 10 --> using entrySet view
    
		 */
		
		
		List <String> lst = new ArrayList<>();
		
		String[] arr = {"Darben","Pinkney","Lamburn",
				"Secretan","Kawse","Pinkney","Martynikhin",
				"Oram","Pinkney","Glaze","Martynikhin",
				"John","Adam","Zack"};
	
		for(String name : arr) {
			
			lst.add(name);
			
		}System.out.println(lst);
		
		Map <String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < lst.size(); i++) {
			
			map.put(lst.get(i), lst.get(i).length());
			
		}System.out.println(map);
		
		
	//	Set <Entry<String, Integer >>entrySetView = map.entrySet();
		
		Set <String> keySet = map.keySet();
		Collection <Integer> values= map.values();
		
		Iterator <String> setIte = keySet.iterator();
		
		while(setIte.hasNext()) {
			
			if(setIte.next().startsWith("P")) {
				
				setIte.remove();
				
			}
		
		}System.out.println(map);
		
       Iterator <Integer> valueIte = values.iterator();
		
		while(valueIte.hasNext()) {
			
			if(valueIte.next() == 6) {
				
				valueIte.remove();
				
			}
		
		}System.out.println(map);
		
		
		for (Entry<String, Integer> eachEntry : map.entrySet()) {
			
			
			if(eachEntry.getValue() >10) {
				
				eachEntry.setValue(-99);
				
			}
		}System.out.println(map);
		
		
   
	}

}
