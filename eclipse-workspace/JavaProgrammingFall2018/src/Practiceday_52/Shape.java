package Practiceday_52;

public abstract class Shape implements Drawable{
	
	String name;
	
    public Shape() {
		
	}
    
	public Shape(String name) {
		this.name=name;
		
	}   
	
	
	public abstract void calculateArea();
	

}
