package day53_Abstraction_Polymorphism;

public class Circle extends Shape{

	int radius;
	
	public Circle() {
        System.out.println("This is Circle");
}
	
	public Circle(String name,int radius) {
		super(name);
		this.radius=radius;
	}
	public  void calculateArea() {
		
		int result=(int)3.14*radius*radius;
		System.out.println(result);
	}

	@Override
	public void draw() {
		
	}

}
