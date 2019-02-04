package Practice_day50;

public class Product {
	
	private String name;
	public static final boolean IS_AVAILABLE=true;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product() {
		this("unknown");
		//name="unknown";	
	}
	public Product(String name) {
		
		this.name=name;
	}
	public String toString() {
		
		return "Name: "+name;
	}
	public void buy() {
		System.out.println("Buying product: "+name);
	}
	

}
