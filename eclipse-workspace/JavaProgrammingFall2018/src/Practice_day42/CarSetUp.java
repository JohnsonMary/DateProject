package Practice_day42;

public class CarSetUp {
	public static void main(String[] args) {
		
	
	
	Car car1=new Car();
	
	car1.setType("Sedan");
	car1.setMake("Acura");
	car1.setModel("A3");
	car1.setSpeed(30);
	
	System.out.println("Car 1: "+car1.getType()+"|"+car1.getMake()+"|"+car1.getModel()+"|"+car1.getSpeed());
	
	car1.accelerate(30);
	System.out.println(car1.getSpeed());
	
	Car car2=new Car();
		
    System.out.println(car2.getModel());
    System.out.println(car2.getType());
	System.out.println("================");
		
    Car car3=new Car("Coupe","Ford","Mustang",30); 
    
    System.out.println(car3.getMake());
    System.out.println(car3.getModel());
    System.out.println(car3.getType());
    System.out.println(car3.getSpeed());
    
	
	
	
	
	
	}	
	
	
	
	

}
