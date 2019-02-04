package day25_Arrays02;

public class ArrayReverse {
	public static void main(String[] args) {
		String reversed="";
		int [] points= new int [] {35,23,70,4,56,43,2,34,78,66};
		
		if(points.length==10) {
			System.out.println("10 points found");
			
  	}else {
            System.out.println("We need 10 points");
            
  	} 
			for(int i=points.length-1; i>=0; i--) {
    			
    		 System.out.print(points[i]+" ");
    			
    			
    		}
		System.out.println("---While loop--");
		
		int idx = points.length-1;
		
		
		while(idx>=0) {
			
			System.out.print(points[idx]+" ");
			idx--;
			
			
		}
		
		
		
		
		
		
  	}	
		
	}

	
