package PtacticeD_day_34;

public class mileTokm {
	public static void main(String[] args) {
		
		System.out.println(mile2Km(100));
		double miles=mile2Km(75);
		System.out.println(miles);
		
		if(mile2Km(100)>100) {
			System.out.println("Slow down");
			
			
		}else {

			System.out.println("You're good");
		}	
	}

	public static double mile2Km(double miles) {
		
		
		double km=miles*1.60934;
		
		return miles*1.60934;
	}
}
