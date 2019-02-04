package practice_40;

public class CellPhone {
	
	String brand,color;
	double price;
	
	public void call() {
		
	System.out.println("I'm calling my mom with my new "+brand);	
		
	}
	public void text() {
		
		System.out.println("I just texted my son with my "+color+" "+brand);
	}

	public void alarm() {
		
		System.out.println("I bought the phone for $"+price+" but the alarm set doesn't work");
	}
	public static void main(String[] args) {
		
		CellPhone phone1=new CellPhone();
		CellPhone phone2=new CellPhone();
		
		phone1.brand="Iphone 8";
		phone2.brand="Iphone 8+";
		
		phone1.color="rose gold";
		phone2.color="gray";
		
		phone1.price=950;
		phone2.price=1100;

		phone1.call();
		phone2.text();
		phone1.alarm();
		
		double total=phone1.price+phone2.price;
		System.out.println("The price of the first phone is $"+phone1.price);
		System.out.println("The total price of both phones are $"+total);
		System.out.println("First phone's color is "+phone1.color);
		
	}
	
}
