package day42_encapsulation02_constructors;

public class Car{
	
	private String type;
	private String make;
	private String model;
	private int speed;
	
	public Car() {
		
		System.out.println("Car class constructor" );
		type="unknown";
		make="unknown";
		model="unknown";
	}
	
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
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}

public void accelerate(int mph) {
	
	speed+=mph;
	System.out.println(make+" "+type+" is accelerating.");
	
	
}
	
	
	
}