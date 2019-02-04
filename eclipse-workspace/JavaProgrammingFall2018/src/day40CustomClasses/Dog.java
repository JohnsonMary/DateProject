package day40CustomClasses;

public class Dog {
	
	String name,color;
	int size;
	
	
	public void bark() {
		
		System.out.println("My dog "+name+" is barking.");
		
	}
	public void eat()	{
		
		System.out.println(name+" is eating a lot of food.That's why his weight is "+size);
	}
	public void run() {
		
		System.out.println("My "+color+" dog is running in the park");
	}
	public static void main(String[] args) {
		
		Dog doggie=new Dog();
		doggie.name="Fluffy";
		doggie.size=75;
		doggie.color="white";
		
		
		
		doggie.eat();
		doggie.run();
		doggie.bark();
		
		
		
		
	}
	

}
