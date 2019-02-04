package Practice_day42;

public class Handbag{
	
	private String brand;
	private String type;
	private double price;
	
	
	public String getBrand() {
		
		return brand;
	}
	public void setBrand(String brand) {
		
		this.brand=brand;
		
	}
	public String getType() {
		
		return type;
	}
	public void setType(String type) {
		
		this.type=type;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		
		this.price=price;
	}
	
	public Handbag() {
		
		brand="unknown";
		type="unknown";
		price=0;
		
	}
	
	public Handbag(String brand,String type,double price) {

		this.type=type;
		this.brand=brand;
		this.price=price;
	
	
	}	
	
}
