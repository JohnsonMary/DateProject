package Practiceday_52;

public class Rectangle extends Shape implements Drawable{
	
	int width;
	int height;
	
	
	public Rectangle(String name,int width,int height) {
		super(name);
		this.width=width;
		this.height=height;
	}

	
	public void calculateArea() {
		
		double result=width*height;
		System.out.println(result);
	}

	public  void draw() {
		System.out.println("Lets draw a rectangle");
	}


}
