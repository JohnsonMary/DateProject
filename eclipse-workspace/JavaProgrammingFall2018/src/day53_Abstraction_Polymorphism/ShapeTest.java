package day53_Abstraction_Polymorphism;

public class ShapeTest {
	public static void main(String[] args) {
		
		Rectangle r1= new Rectangle("rec1",3,11);
        Rectangle r2 = new Rectangle("rec2", 31, 21);
		
		r1.calculateArea();
		r2.calculateArea();
		
		Circle c1 = new Circle("cir1 ", 5);
		Circle c2 = new Circle("cir2 ", 12);
		
		c1.calculateArea();
		c2.calculateArea();
		
		
	}

}