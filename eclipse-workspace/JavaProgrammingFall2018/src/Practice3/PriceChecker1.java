package Practice3;

public class PriceChecker1 {
	public static void main(String[] args) {
		
		
		int price=110;
		String status="";
		
		
		if(price>=1 && price<=50) {
			status="Cheap";
			
		}else if(price >=51 && price<=100) {
			status="Expensive";
			
		}else {
			status="Not buying";
		}
		
		System.out.println(status);
		
		///
status=(price>=1 && price<=50)?"cheap":(price>=51 && price<=100)?"expensive":"not buying";
		
System.out.println(status);
		
		
	}

}
