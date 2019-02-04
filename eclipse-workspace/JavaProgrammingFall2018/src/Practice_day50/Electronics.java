package Practice_day50;

public class Electronics extends Product{
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public Electronics(String name,double price) {
		super(name);
		this.price=price;
		
	}
	public Electronics() {
		
		//super("Unknown electronics");
		setName("Unknown electronics");
		
	}
	@Override
	public String toString() {
		
		return super.toString()+" Price: "+price;
	}
	@Override
	public void buy() {
		super.buy();
		System.out.println("Buying product: $"+price);
	}
	

}
