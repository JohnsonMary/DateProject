package beans;

public abstract class Payment {
	
	private MyDate transaction_date;
	private Product product;
	private double price;
	private String type;
	private String name;
	private Location location;
	
	
	public String toString() {

	     return transaction_date.toString()+","+
	               product.getProductName()+","+
	    		   price+","+
	               type+","+
	               name+","+
	    		   location.toString();
	}
	
	public MyDate getTransaction_date() {
		return transaction_date;
	}
	
	public void setTransaction_date(MyDate transaction_date) {
		this.transaction_date = transaction_date;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	

}
