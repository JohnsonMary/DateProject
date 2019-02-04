package Practice_day42;

public class HandbagKinds {
	public static void main(String[] args) {
		
		Handbag bag1=new Handbag();
		
		bag1.setBrand("Michael Kors");
		bag1.setType("Hobo");
		bag1.setPrice(310.0);
		
		Handbag bag2=new Handbag();
		
		bag2.setBrand("Louis Vuitton ");
		bag2.setType("Tote");
		bag2.setPrice(2500);
		
		System.out.println(bag1.getBrand()+"|"+bag1.getType()+"|"+bag1.getPrice());
		System.out.println(bag2.getBrand()+"|"+bag2.getType()+"|"+bag2.getPrice());

		Handbag bag3=new Handbag("Coach","Purse",350.0);
		System.out.println(bag3.getType());
		 
		
		

		
		
		
		
		
	}

}
