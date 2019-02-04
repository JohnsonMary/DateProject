package day42_encapsulation02_constructors;

public class CarMax {
	public static void main(String[] args) {
		
		Car car1=new Car();
		
		car1.setMake("Acura");
		car1.setModel("ILX");
		car1.setType("Sedan");
		car1.setSpeed(35);
		
		System.out.println("Make: "+car1.getMake());
		System.out.println("Current Speed: "+car1.getSpeed());
		
		car1.accelerate(30);
		System.out.println("Current speed: "+car1.getSpeed());
		
		Car car2=new Car();
		System.out.println("Car 2 make: "+car2.getMake());
		
		
		
	}
	
	

}
