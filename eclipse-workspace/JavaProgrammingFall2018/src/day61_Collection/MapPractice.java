package day61_Collection;

import java.util.*;
import java.util.Map.Entry;

public class MapPractice {
	
	public static void main(String[] args) {
		
		Map <String, String> map = new HashMap<>();
		map.put("1","A");
		map.put("2","B");
		map.put("3","C");
		map.put("4","D");
		map.put("5","E");
		map.put("6", null);
		
		System.out.println( map.get("1"));
		System.out.println( map.get("5"));
		
		map.putIfAbsent("5", "Z");
		
		System.out.println(map);
		
		map.replace("4", "K");
		System.out.println(map);
		
		map.replace("3", "C", "CCC");
		System.out.println(map);
		
		System.out.println( map.get("abc"));
		
		// get if you have it, if not get the default value;
		// that avoids us to get nullPointerException:
		
		String abcVal = map.getOrDefault("abc", "defaultValue");
		System.out.println(abcVal);
		
		//map.remove("6");
		System.out.println(map);
		
		/// view !!!
		/*
		 *  keySet()   values()   , entrySet()
		 *  
		 */
		System.out.println();
		
		
		Set <Entry<String, String >>entrySetView = map.entrySet();
		
		for (Entry<String, String> entry : entrySetView) {
			
			System.out.println(entry.getKey()+" --> "+entry.getValue());
			
			if(entry.getValue()==null) {
				
				entry.setValue("Something else");
				
			}
		}System.out.println(map);
		
		
		
	}

}
