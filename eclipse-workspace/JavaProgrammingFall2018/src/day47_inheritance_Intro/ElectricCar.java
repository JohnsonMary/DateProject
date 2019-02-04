package day47_inheritance_Intro;

public class ElectricCar extends Vehicle{

    public static boolean hasBattery;
	public double batteryLevelMiles;
	
	public void charge() {
		
		System.out.println("I'm charging my car");
		batteryLevelMiles=500;
		
	}
	
	

}
