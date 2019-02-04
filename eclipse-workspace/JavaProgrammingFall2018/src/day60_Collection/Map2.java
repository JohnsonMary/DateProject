package day60_Collection;

import java.util.Map;
import java.util.*;

public class Map2 {
	
	public static void main(String[] args) {
		
		Map<Long,String> product=new HashMap<>();
		product.put(123l, "book"); 
		product.put(23l, "table");
		product.put(300l, "pen");
		product.put(12l, "bed");
		product.put(50l, "pan");
		System.out.println(product);
		
		Set <Long> allKeys = product.keySet(); // keys are always unique so we use Set for keys.
		System.out.println(allKeys);
		
		Collection <String> values = product.values(); // We don't know anything about values
		                                               // so we use Collection for values.
		System.out.println(values);
		
		
	}

}
