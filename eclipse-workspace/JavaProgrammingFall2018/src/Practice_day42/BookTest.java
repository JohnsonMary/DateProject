package Practice_day42;

public class BookTest {

	public static void main(String[] args) {
		
		Book book1=new Book();
		
		book1.setTitle("Woman Power");
		book1.setAuthor("Jane Mood");
		book1.setPages(200);
		
		System.out.println(book1.getTitle()+"|"+book1.getAuthor()+"|"+book1.getPages());
		
		System.out.println(book1.getTitle().replace("Power","Senses"));
		
		
		
		
		
		
	}
}
