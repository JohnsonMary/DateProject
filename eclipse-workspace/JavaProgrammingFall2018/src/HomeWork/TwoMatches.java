package HomeWork;

public class TwoMatches {
	public static void main(String[] args) {
		
		int matches=0;
		
		int arr[][]= {{2,2,1,3,4,5},{5,2,3,3,4,4},{3,2,3,1,4,5}};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length-1; j++) {
				
				if(arr[i][j]==arr[i][j+1]) {
					
					matches++;
					
					
					
				}
				
			}
		}System.out.println(matches);

		
		
		
		
		
	}

}
