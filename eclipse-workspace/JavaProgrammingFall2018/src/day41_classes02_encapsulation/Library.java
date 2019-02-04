package day41_classes02_encapsulation;

public class Library {
	public static void main(String[] args) {
		
		Book book1=new Book();
		book1.setTitle("Grit");
		book1.setAuthor("Henry G.");
		book1.setPages(200);
		
		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthor());
		System.out.println(book1.getPages());
		
		Book javaBook=new Book();
		javaBook.setTitle("Headfirst Java");
		javaBook.setAuthor("Kathy Sierra");
		javaBook.setPages(350);
		
		System.out.println(javaBook.getTitle());
		System.out.println(javaBook.getAuthor());
		System.out.println(javaBook.getPages());

	}
	

}
