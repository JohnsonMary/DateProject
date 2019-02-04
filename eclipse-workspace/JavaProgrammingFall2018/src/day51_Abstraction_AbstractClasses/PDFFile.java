package day51_Abstraction_AbstractClasses;

public class PDFFile extends File {
	
	public PDFFile(String name) {
		super(name);

	}	
	
	@Override
	public void open() {
		
		System.out.println("Opening PDF File using Adobe Acrobat Reader");
	}
	

}
