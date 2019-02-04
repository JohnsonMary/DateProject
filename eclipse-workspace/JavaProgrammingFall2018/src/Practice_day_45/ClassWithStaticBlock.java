package Practice_day_45;

public class ClassWithStaticBlock {
	
	static {
		System.out.println("This is static block.zi run once in the beginning");
	}
	static {
		System.out.println("This is the second static Block.I runonce in the beginning");
	}
	public ClassWithStaticBlock() {
		
		System.out.println("This is constructor.I run everytime object is created.");
	}
	public static void staticMethod() {
		
		System.out.println("This is static method.");
	}

}
