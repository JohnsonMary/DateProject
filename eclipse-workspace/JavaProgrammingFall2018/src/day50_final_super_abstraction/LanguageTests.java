package day50_final_super_abstraction;

public class LanguageTests {

	public static void main(String[] args) {
		
		ProgrammingLanguage pl= new ProgrammingLanguage();
		
		pl.printName();
		pl.printProgrammingName();
		System.out.println(pl.name);
		
		Language l=new Language();
		System.out.println(l.name);
		
		pl.staticMethod();
		
		l.staticMethod();
		
		
		
		
		
		
		
		
	}
}
