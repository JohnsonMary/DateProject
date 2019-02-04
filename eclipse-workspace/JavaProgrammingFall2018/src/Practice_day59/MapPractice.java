package Practice_day59;

import java.util.*;

public class MapPractice {
	public static void main(String[] args) {
		
		Map <String, Integer> medalMap = new HashMap<>();
		
		medalMap.put("USA", 23);
		medalMap.put("Italy", 26);
		medalMap.put("Turkey", 54);
		medalMap.put("Africa", 20);
		medalMap.put("Paris", 25);
		
		System.out.println(medalMap);
		
		System.out.println(medalMap.get("Turkey"));
		medalMap.replace("Italy", 27);
		System.out.println(medalMap);
		medalMap.remove("Paris");
		System.out.println(medalMap);
		
		
		Map <Long, String> product = new HashMap<>();
		
		product.put(367L, "Book");
		product.put(23L, "Pencil");
		product.put(23L, "Eraser");
		product.put(234L, "Printer");
		product.put(54L, "Box");
		
		System.out.println(product.get(367L));
		System.out.println(product.get(23L));
		System.out.println(product.get(54L));
		
		product.replace(367L, "Stapler");
		product.replace(23L, "Water");
		product.replace(23L, "TV");
		
		System.out.println(product);
		
		product.remove(54L);
		System.out.println(product);

		Set<Long> allKeys = product.keySet();
		System.out.println(allKeys);
		
		Collection <String> values = product.values();
		System.out.println(values);
		
		

		
		
		
		
		
	}

}
