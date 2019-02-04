package Practice_day37;
import java.util.*;

public class Cities {
	public static void main(String[] args) {
		
		List <String> things=new ArrayList<>();
		things.add("book");
		things.add("pencil");
		things.add("pencil case");
		things.add("bottle");
		things.add("computer");
		things.add("paper");
		things.add("folder");
		things.add("table");
		things.add("stapler");
		things.add("television");
		things.add("sharpie");
		things.add("scissors");
		things.add("basket");
		things.add("flower");
		things.add("printer");
		
		System.out.println("The count of things: "+things.size());
		
		for(String t:things) {
			System.out.print(t+" ");
			
		}
		System.out.println();
		
		List <String> longNames=new ArrayList<>();
		for(String o:things) {
			
			if(o.length()>6) {
				longNames.add(o);
				
			}
		}System.out.println(longNames);
		

		List <Integer> nums=new ArrayList<>();
		nums.add(100);
		nums.add(200);
		nums.add(300);
		nums.add(400);
		nums.add(500);
		System.out.println(nums);
		
		nums.set(0, 1000);
		System.out.println(nums);
		
		nums.set(1, nums.get(1)*2);
		System.out.println(nums);
		
		nums.set(nums.indexOf(300), 3);
		System.out.println(nums);
		
		nums.set(4, 65);
		System.out.println(nums);


		
		
		
	}

}
