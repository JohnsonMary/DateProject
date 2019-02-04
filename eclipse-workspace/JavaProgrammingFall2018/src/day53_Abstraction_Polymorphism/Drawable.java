package day53_Abstraction_Polymorphism;

public interface Drawable {
	
	public static final String COLOR="White";
	
	public abstract void draw();
	
	public default void drawSquare() {
		
		System.out.println("I will wait for your square");
	}
	public static void doStaticStuff() {
		System.out.println("It is static");
	}
	// RULE FOR VISIBILITY : Same or more visible 


	// this is from super class
	// private void draw(){};

	//public  ---> public 
	//protected --> protected + public 
	// default ---> default + protected + public
	// private ---XXXX!!!!

	//this is overriding from sub class
	// void draw(){};

	
	
	
	
	
	


}
