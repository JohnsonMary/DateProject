package Repl.it;

public class HowManyStrings {
	public static void main(String[] args) {
		
		String str[]= {"foo","boo","hoo","boo"};
		String word="boo";
		System.out.println(count_appearance(str,word));
		
	}
	
	public static int count_appearance(String [] arr, String t) {
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i].equalsIgnoreCase(t)) {
				
				count++;
			}
			
		}return count;
	}

}
