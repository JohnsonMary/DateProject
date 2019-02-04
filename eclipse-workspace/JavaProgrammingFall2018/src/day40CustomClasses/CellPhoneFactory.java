package day40CustomClasses;

public class CellPhoneFactory {
	public static void main(String[] args) {
		
		
		CellPhone phone1 = new CellPhone();
		phone1.brand="Apple iPhone XS";
		phone1.color="Rose Gold";
		phone1.price=999.0;
		
		phone1.call();
		phone1.text();
		
		CellPhone phone2=new CellPhone();
		CellPhone phone3=new CellPhone();
		
		phone2.brand="Ericson";
		phone2.color="Silver";
		phone2.price=30.5;
		
		phone3.brand="HTC Evo";
		phone3.color="Black";
		phone3.price=350.99;
		
		phone2.call();
		phone3.text();
		
		System.out.println("phone1 brand -"+phone1.brand);
		System.out.println("phone2 brand -"+phone2.brand);
		System.out.println("phone3 brand -"+phone3.brand);
		
		double total=phone1.price+phone2.price+phone3.price;
		System.out.println("Total of 3 phones: $"+total);
		
		phone1.price=1200.0;
		phone2.price=phone1.price;
		System.out.println(phone2.price);
		
		

		
		
	}

}
