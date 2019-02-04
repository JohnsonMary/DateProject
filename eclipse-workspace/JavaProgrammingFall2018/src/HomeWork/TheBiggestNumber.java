package HomeWork;

public class TheBiggestNumber {
	
	public static void main(String[] args) {
		
		int arr[][]= {{34,22,67},{44,79,665,1},{78,566}};
		int biggest=0;
		
		for(int i=0; i<arr.length; i++) {
			
			 for(int j=0; j<arr[i].length; j++) {
				 
				 if(arr[i][j]>biggest) {
					 
                   biggest=arr[i][j];
				
                   
			 }

				
				
			}

			
		}System.out.println(biggest);
	

		
		 }	
		
	}


