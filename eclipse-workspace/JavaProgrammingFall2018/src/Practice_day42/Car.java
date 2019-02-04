package Practice_day42;

public class Car {
	
	private String type;
	private String make;
	private String model;
	private int speed;
	
	public String getType() {
	
		return type;
    }
	
	public void setType(String type) {
		
		this.type=type;
	}
	public String getMake() {
		
		return make;
	}
	
	public void setMake(String make) {
		
		this.make=make;
	}
	public String getModel() {
		
		return model;
	}
	public void setModel(String model) {
		this.model=model;
		
	}
	public int getSpeed() {
		
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
		
	}
	
	public void accelerate(int mph) {
		
		speed+=mph;
		System.out.println(make+" "+type+" is accelerating");
		
		
	}
	public Car() {
		
		this.type="unknown";
		this.make="unknown";
		this.model="unknown";
		

	}
	
	public Car(String type,String make,String model,int speed) {
		
		this.type=type;
		this.make=make;
		this.model=model;
		this.speed=speed;
	
		
	}
	
	
	
	
	
	
	
	

}
