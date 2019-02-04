package day60_Collection;

import java.util.*;

public class MapPractice {
	public static void main(String[] args) {
		
		// Type<typeOfItem> -----

				// Type<KeyType, ValueType> ----

				// i want to store country and gold medal count as per item

				Map<String, Integer> ctMedalMap = new HashMap<>();
				ctMedalMap.put("USA", 28);
				ctMedalMap.put("UK", 20);
				ctMedalMap.put("France", 17);
				ctMedalMap.put("Italy", 25);
				ctMedalMap.put("Italy", 100);

				//System.out.println(ctMedalMap);

				// // CRUD Operation ---> Create , Read/Retrieve, Update, Delete
				// System.out.println( ctMedalMap.get("USA") );
				//
				// Integer cntOfItaly = ctMedalMap.get("Italy") ;
				// System.out.println(cntOfItaly);
				//
				// ctMedalMap.replace("Italy", 50) ;
				// System.out.println( "New Italy Count: " + ctMedalMap.get("Italy") );
				//
				// ctMedalMap.remove("Italy") ;
				// System.out.println(ctMedalMap);
				//
				/*
				 * Create a map of Long , String to represent product ID and product name add 5
				 * items , try to add duplicate and see what happen read first 3 values update
				 * second product name remove last product
				 * 
				 * print out each time you do a change
				 * 
				 */
				Map<Long, String> product = new HashMap<>();
						product.put(123L, "book");
						product.put(23L, "table");
						product.put(300L, "pen");
						product.put(12L, "bed");
						product.put(50L, "pan");
						
				System.out.println(product);
				
				System.out.println(product.get(123L));
				product.replace(23L, "chair");
				System.out.println(product);
				product.remove(50L);
				System.out.println(product);

		
		Map <Long, String> map = new HashMap<>(); // Long-> key, String->value
		                                          
		map.put(373L, "Apples"); // like adding
		map.put(4646L, "Pears");
		map.put(363L, "Cherry");
		map.put(26L, "Lemon");
		map.put(363L, "GreenApple");
		
		System.out.println(map.get(373L));
		System.out.println(map.get(363L));
		System.out.println(map.get(26L));
		map.replace(363L, "Strawberry"); // like changing the value
		System.out.println(map.get(363L)); // gives me Strawberry, the last assignment.
		map.remove(363L);    
		System.out.println(map);
		
		

		
		
	}

}
