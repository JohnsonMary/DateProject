package Practice_day42;

public class BagSpecialities {
	
  public static void main(String[] args) {
		
		Bag bag1=new Bag();
		
		bag1.setBrand("Michael Kors");
		bag1.setType("Hobo");
		bag1.setColor("Burgundy");
		bag1.setPrice(250.0);
		
		Bag bag2=new Bag();
		
		bag2.setBrand("Coach");
		bag2.setType("Shoulder");
		bag2.setColor("Beige");
		bag2.setPrice(235.0);
		
		Bag bag3=new Bag();
		
		bag3.setBrand("Louis Vuitton");
		bag3.setType("Tote");
		bag3.setColor("Brown");
		bag3.setPrice(1900.0);
		
		System.out.println(bag3.getBrand()+"|"+bag3.getColor()+"|"+bag3.getType()+"| $"+bag3.getPrice());
		System.out.println(bag2.getBrand()+"|"+bag2.getColor()+"|"+bag2.getType()+"| $"+bag2.getPrice());
		System.out.println(bag1.getBrand()+"|"+bag1.getColor()+"|"+bag1.getType()+"| $"+bag1.getPrice());

		
		Bag bag4=new Bag();
		bag4.setBagInfo("Louis Vuitton",2500.0);
		System.out.println(bag4.getBagInfo());
		
		
		
		
		
	}

}
