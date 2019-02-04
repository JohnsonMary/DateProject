package day36_overloading_arraylist;

import java.util.ArrayList;

public class StringsOnlyArrayList {
	public static void main(String[] args) {
		
		//ArrayList <String> names;
	   // names=new ArrayList <>();
		ArrayList<String> names=new ArrayList<>();
		names.add("David");
		names.add("Bahar");
		names.add("Mary");
		names.add("Matthew");
		
		System.out.println(names);
	    
	    int length=names.size();
	    System.out.println("Number of Names: "+length);
		
	    String first=names.get(0);
	    System.out.println("First name: "+first);
	    
	    String last=names.get(names.size()-1);
	    names.remove(0);
	    System.out.println(names);
	    names.remove(names.size()-1);
	    System.out.println(names);
	    
	    ArrayList<Integer>nums=new ArrayList<>();

	    
	}

}
