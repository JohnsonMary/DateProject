package day54_Polyphormism;

public interface  WebDriver {
	
	// public static final 
		// protected int browserCount = 10 ; 
		
		/*
		 * 1, CONSTANT --> public static final variable
		 * 2, abstract method 
		 * 3, default method
		 * 4, static method 
		 * */
		void navigate(String url);
		void open(); 
		void close(); 
		public default void quit() {
			System.out.println("default quit method, sub class may override it or use it as is");
		}
		

	}



