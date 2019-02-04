package day50_final_super_abstraction;

public class ProgrammingLanguage extends Language{
	
	public String name="Programming Language-Java";

	public void printProgrammingName() {
		
		System.out.println("Programming L: "+name);
		//System.out.println(super.name);
	}
	
	
   public static void staticMethod() {
		
		System.out.println("Programming Language - static method");
	}
	
}
