package day53_Abstraction_Polymorphism;

public abstract class Shape implements Drawable{
	
	String name;
	
	public Shape() {
		
	}
	public Shape(String name) {

	this.name=name;
	}
	
	
	public abstract void calculateArea();
	
	
}
