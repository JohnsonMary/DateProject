package day53_Abstraction_Polymorphism;

public class Rectangle extends Shape implements Drawable{
	
	int width;
	int height;
	
	
	public Rectangle (String name,int width,int height) {
		
		super(name);
		this.width=width;
		this.height=height;
		
		
	}
	
	public void  calculateArea() {

		int result=width*height;
		System.out.println(result);
		
	}
	
	

	

	@Override
	public void draw() {
		
	}


}
