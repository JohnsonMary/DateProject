package Practiceday_52;

public class Circle extends Shape{
	
	int radius;
	
	public Circle() {
		
		System.out.println("This is circle");
	}
	
	public Circle(String name,int radius) {
		super(name);
		this.radius=radius;
	}

	
	public void calculateArea() {

		int result=(int) 3.24*radius*radius;
		System.out.println(result);
	}

	@Override
	public void draw() {
		System.out.println("Lets draw a circle");
	}
	
	
}
