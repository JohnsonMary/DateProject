package Practice_day50;

public class ProgrammingLanguage extends Language{
	
	public String name ="Programming Language";
	
	public void printProgrammingName() {
		System.out.println("Programming L: "+name);
	}
	
	public static void staticMethod() {
		System.out.println("Programming Language-static method");
	}
	@Override
	public void printName() {
		System.out.println("Language: "+name);
		staticMethod();
	}

}
