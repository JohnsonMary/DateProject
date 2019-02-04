package Practice_28;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		
		String words[]={"tomatoes","cake","carrots","menu","salad"};
		
		Arrays.sort(words);
		System.out.print(Arrays.toString(words));
		
		System.out.println(Arrays.binarySearch(words, "menu"));
		
		
		
		
		
	}

}
