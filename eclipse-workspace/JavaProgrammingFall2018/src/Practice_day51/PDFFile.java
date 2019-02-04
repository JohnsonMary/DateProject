package Practice_day51;

public class PDFFile extends File{
	
	@Override
	public void open() {
		
		System.out.println("Opening PDF File");
	}
	public PDFFile(String name) {

		super(name);

    }
	public PDFFile() {
		
	}
}