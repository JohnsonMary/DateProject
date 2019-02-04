package day45_static_block_inheritance_intro;

public class ClassWithINITBLOCK {
	
	static{

		System.out.println("Static block.I run one time before Init or constructor but once only");
	}
	
	{
		System.out.println("This is initializer block.I run whenever an object is created");
	}
	
	public ClassWithINITBLOCK() {
		
		System.out.println("This is a constructor.I run this everytime object is created.");
		
	}
	public static void staticMethod() {
		
		System.out.println("Static method");
	}
}
