package Practice_day55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TV {
	public static void main(String[] args) {
		
		TV t = new TV();
		System.out.println(t);
		
		int[] arr = {1,2,3};
		System.out.println(arr);
		

		List <Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		Person p1 = new Person("John", 25);
		System.out.println(p1);
		
		

		
	}

	@Override
	public String toString() {
		return "TV to String method";
	}

}
