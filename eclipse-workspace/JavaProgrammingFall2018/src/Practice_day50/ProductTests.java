package Practice_day50;

public class ProductTests {
	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.setName("Samsung");
		p1.buy();
		
		Electronics el= new Electronics();
		el.setName("Dyson");
		el.setPrice(450.00);
		el.buy();
		
		Product p2= new Product("Sony play station");
		System.out.println(p2.toString());
		
		Electronics el2=new Electronics("Vacuum Cleaner",255.00);
		System.out.println(el2.toString());
		
		System.out.println(Product.IS_AVAILABLE);
		System.out.println(Electronics.IS_AVAILABLE);
		
		
		
	}

}
