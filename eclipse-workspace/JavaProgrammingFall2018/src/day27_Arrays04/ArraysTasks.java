package day27_Arrays04;

public class ArraysTasks {
	public static void main(String[] args) {
		
		String arr[]=new String[] {"apples","banana","kiwi","cherries"};
		
		for (String fruit: arr) {
			
			System.out.println(fruit.substring(0,3));
			
		}

		for(int k=0; k< arr.length; k++) {
			
			System.out.println(arr[k].substring(0,3));
		}

		
		
		
	}

}
