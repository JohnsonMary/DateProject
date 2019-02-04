package Practice_day_25;

public class ArrayPrintReverse2 {
	public static void main(String[] args) {
		
		int points[]= {43,6,87,43,5,67,3,6,4,89,76};
		
		if(points.length==10) {
			System.out.println("10 points found");
		}else {
			System.out.println("We need 10 points");
		}

		for(int i=points.length-1; i>=0;i--) {
			
			System.out.print(points[i]+" ");
			
			
			
		}
		System.out.println();
		int idx=points.length-1;
		
		while(idx>=0) {
			
			System.out.print(points[idx]+" ");
			idx--;
			
			
			
		}
		
		
		
	}

}
