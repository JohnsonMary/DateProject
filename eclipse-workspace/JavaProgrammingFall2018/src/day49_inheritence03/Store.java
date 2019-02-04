package day49_inheritence03;

public class Store {
	
	private String type;
	private double rent;
	
	
	public Store(String type) {
		
		this.type=type;
		System.out.println("Store constructor with Type: "+type);
	}
	public Store(double rent) {
		
		this.rent=rent;
		System.out.println("Store constructor with Rent: "+rent);
		
	}
	public Store(String type,double rent) {
		this.type=type;
		this.rent=rent;
		System.out.println("Store constructor with Type: "+type+" and Rent: "+rent);
		
	}
	

	
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public void setType() {
		
		this.type=type;
	}
	public String getType() {
		return type;
	}
	

}
