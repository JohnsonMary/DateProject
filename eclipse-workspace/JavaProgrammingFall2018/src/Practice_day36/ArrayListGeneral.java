package Practice_day36;

import java.util.ArrayList;

public class ArrayListGeneral{
	public static void main(String[] args) {
		
		
		ArrayList list=new ArrayList();
		
		list.add("Bloomfield");
		list.add("Clifton");
		list.add("07003");
		list.add('N');
		
		System.out.println(list);
		
		System.out.println(list.get(1));
		System.out.println(list.size());
		
		ArrayList countries=new ArrayList();
		
		ArrayList <String> names=new ArrayList <>();
		
		names.add("Jamie");
		names.add("Zehra");
		names.add("Meryam");
		System.out.println(names);
		
		System.out.println(names.get(1));
		System.out.println(names.size());
		System.out.println(names.get(names.size()-1));
		System.out.println(names.get(names.size()-2));
		System.out.println(names.remove(0));
		System.out.println(names);
		String name=names.remove(1);
		System.out.println(name);
		names.add("Yaprak");
		
	    
		
		
		
	}

}
