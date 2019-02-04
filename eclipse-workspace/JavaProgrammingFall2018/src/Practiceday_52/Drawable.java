package Practiceday_52;

public interface  Drawable {
	
	public static final String COLOR="White";
	
	public abstract void draw();
	
	public default void drarSquare() {
		System.out.println("Square");
	}
	
	public static void doStaticStuff() {
		System.out.println("It is Static");
	}
	

}
