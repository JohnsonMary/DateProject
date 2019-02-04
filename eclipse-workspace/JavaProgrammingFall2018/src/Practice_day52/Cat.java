package Practice_day52;

public class Cat implements Animal,Duck{
	
	public void size() {
		System.out.println("Big");
	}
	public void makeSound() {
		System.out.println("Meow!");
	}
	
	public void Duck() {
		System.out.println("Vak vak!");
	}
	@Override
	public void walk() {		
		
		System.out.println("WALKING");
		
	}
	

}
