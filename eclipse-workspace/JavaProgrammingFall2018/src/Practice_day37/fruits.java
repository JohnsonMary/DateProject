package Practice_day37;
import java.util.*;

public class fruits {
	public static void main(String[] args) {
		
		ArrayList <String> fruits1=new ArrayList<>();
		List <String>fruits2 =new ArrayList<>();
		ArrayList <String>fruits3=new ArrayList<>(10);
		List <String>fruits4=new ArrayList<>(fruits1);
		
		List<String>fruits5=Arrays.asList
	    (new String[] {"Watermelon","Peach","PineApple","Kiwi"});
		
		System.out.println("Fruits5 are: "+fruits5);
		fruits1.add("Grapes");
		fruits1.add("Tomato");
		fruits1.add("Blueberries");
		fruits1.add("Blackberries");
		fruits1.add(0,"Orange");
		fruits1.add(4,"Strawberries");
		
		
		fruits2.addAll(fruits1);
		fruits2.add("Dragon Fruit");
		System.out.println("Fruits2 are: "+fruits2);
		
		fruits1.remove("Strawberries");
		System.out.println("Fruits1 are: "+fruits1);
		
		fruits2.removeAll(fruits1);
		System.out.println(fruits2);
		
		fruits1.clear();
		System.out.println(fruits1.isEmpty());
		
		List <Integer>nums=new ArrayList<>();
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		nums.remove(new Integer (3));
		nums.remove(nums.indexOf(4));
		System.out.println(nums);

		
		
		
		
	}

}
