package day49_inheritence03;

public class Cat extends Animal{
	
	public Cat() {
		super("Garfield");
		System.out.println("Cat object is created");
	}
    public void speak() {
		
		System.out.println("Animal is speaking meow");
	}

}
