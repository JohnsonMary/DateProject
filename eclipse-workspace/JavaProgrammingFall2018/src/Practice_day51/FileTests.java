package Practice_day51;

public class FileTests {
	public static void main(String[] args) {
		
		XLSFile xl=new XLSFile();
		xl.open();
		xl.close();
		
		xl.setName("Java");
		System.out.println(xl.getName());
		
		JPGFile jpg=new JPGFile();
	    jpg.open();
		jpg.close();
		
		jpg.setName("Java");
		System.out.println(jpg.getName());
		
		System.out.println(File.count);
		System.out.println(xl.count);
		System.out.println(jpg.count);
		
		PDFFile pdf=new PDFFile();
		pdf.open();
		pdf.close();
		
		System.out.println(pdf.count);
		
		
		
		
		
		
	}

}
