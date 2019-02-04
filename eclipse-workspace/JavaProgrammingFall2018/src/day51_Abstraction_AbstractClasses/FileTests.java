package day51_Abstraction_AbstractClasses;

public class FileTests {
	public static void main(String[] args) {
		
		XLSFile xl=new XLSFile();
		xl.open();
		xl.close();
		xl.setName("TestData.xls");
		System.out.println("XLS file name: "+xl.getName());
		
		JPGFile jpg = new JPGFile();
		jpg.setName("Event01.jpg");
		jpg.open();
		jpg.close();
		System.out.println("JPG file name: "+jpg.getName());
		
		
		System.out.println(File.count);
		System.out.println(JPGFile.count);
		System.out.println(XLSFile.count);
		
		
		PDFFile pdf=new PDFFile("AgileBook.pdf");
		pdf.open();
		pdf.close();
		
		System.out.println(File.count);
		
	}

}
