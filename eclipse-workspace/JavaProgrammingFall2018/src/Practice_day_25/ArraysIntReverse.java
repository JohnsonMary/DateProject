package Practice_day_25;

public class ArraysIntReverse {
	public static void main(String[] args) {
		
		int points[]=new int[] {34,56,23,45,3,1,56,77,65,44};
		
			
			if(points.length==10) {
				System.out.println("10 points found");
				
			}else {
				System.out.println("10 points not found");
			}

			for(int k=points.length-1; k>=0; k--) {
				
				System.out.print(points[k]+",");
				
			}System.out.println();
		
			int h=points.length-1;
			
		while(h>=0) {
			
			System.out.print(points[h]+",");
			h--;
			
		}
		
		
		
		
		
		
	}

}
