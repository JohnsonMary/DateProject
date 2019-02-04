package day10_Conditionals4;

public class PriceChecker {
	public static void main(String[] args) {
		
		
			
			
			int price=90;
					
		    String status;
			
			if(price>=1 && price<=50) {
				status="Cheap";
			}else if(price>=51 && price<=100) {
				status="Expensive";
			}else {
				status="Not buying";
			}
		System.out.println(status);

		
		
status=(price>=1 && price<=50)?"Cheap":(price>=51 && price<=100)?"Expensive":"Not buying" ;       
System.out.println(status);

		
		
		
		
		
		
		
		
		
	}

}
