package practic_day_27;

public class Fruits {
	public static void main(String[] args) {
		
		///The code provided in your main method will take in five Strings and save them into an array called arr.  Print out the first three letter of each element of arr, one per line.  You can assume that every element of arr is at least 3 letters long.

        //Example:
        //arr -> ["apple", "banana"] 
        //prints app  ban
		
		String[] fruits= {"apple","banana","mango","orange"};
		
		for(String f:fruits) {
			
			System.out.println(f.substring(0,3));
			
		}
		for(int i=0; i<fruits.length; i++) {
			
			System.out.println(fruits[i].substring(0, 3));
			
		}
		
		
		
		
		
	}

}
