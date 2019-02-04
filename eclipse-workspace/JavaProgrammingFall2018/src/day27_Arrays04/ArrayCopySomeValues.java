package day27_Arrays04;

public class ArrayCopySomeValues {
	public static void main(String[] args) {
		
		
		int counter=0;
		
		 String[] arr = {"zero", "one", "two","three","four"};
		 
		 for(String str:arr) {
			 
			 if(str.contains("e")) {
				 
				 counter++;
			  System.out.print(str+" "); 
			 }
			 
		 }
		System.out.println(counter);
		String fewValues[]=new String[counter];
		
		int i=0;

		for(String each:arr) {
			
			if(each.contains("e")) {
				
				fewValues[i]=each;
				i++;
				
			}
			
		}
		
		
		
	}

}
