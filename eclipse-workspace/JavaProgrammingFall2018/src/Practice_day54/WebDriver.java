package Practice_day54;

public interface  WebDriver {
	
	void navigate(String URL);
	void open();
	void close();
	
	public default void quit() {
     System.out.println("Default quit method");
	}
	
}
