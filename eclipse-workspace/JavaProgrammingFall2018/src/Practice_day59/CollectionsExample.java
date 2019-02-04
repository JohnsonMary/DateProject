package Practice_day59;

import java.util.*;

public class CollectionsExample {
	public static void main(String[] args) {
		
		List <String> lst = new ArrayList<>();
		lst.add("Apple");
		lst.add("Lemon");
		lst.add("z");
		lst.add("Orange");
		lst.add("Lemon");
		lst.add("Avocado");
		lst.add("9");
		
		System.out.println(lst.subList(2, 5));
		System.out.println(lst);
		
		Set <String> set = new HashSet<>(lst);
		System.out.println(set);
		
		SortedSet <String> sSet = new TreeSet<>(lst);
		System.out.println(lst);
		System.out.println(sSet);
		
		System.out.println(sSet.size());
		System.out.println(sSet.subSet("9", "z"));
		
		for (int i = 0; i < lst.size(); i++) {
			
			set.add(lst.get(i));
			
		}
		System.out.println(set);
		
		
		
		
		
		

		
		
		
		
		
	}

}
