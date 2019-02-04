package Repl.it;

public class Cover {
	public static void main(String[] args) {
		
		System.out.println(coverString("Certified Wooden Spoon", "o"));
		
	}

	
	  public static String coverString(String main, String coverMe) {
		  
		  if(main.contains(coverMe)) {
			  
			  main=main.replace(coverMe, "["+coverMe+"]");
			  
			  
		  }else {
			  main=main.replace(main,"["+main+"]");
			  
		  }return main;

	  }  
}
