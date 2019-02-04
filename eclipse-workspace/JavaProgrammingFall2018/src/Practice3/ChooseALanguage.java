package Practice3;
import java.util.Scanner;

public class ChooseALanguage {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Please select a language\n"+
		                   "1.Turkish\n"+
	    		           "2.English\n"+
		                   "3.Spanish");
	    
	    int lan=scan.nextInt();
	    String greeting="";
	    
	    if(lan==1) {
	    	greeting="Merhaba!";
	    	
	    }else if(lan==2) {
	    	greeting="Hello!";
	    	
	    }else if(lan==3) {
	    	greeting="Hola!";
	    	
	    }System.out.println(greeting);
	    
	    greeting=(lan==1)?"Merhaba!":(lan==2)?"Hello!":"Hola!";
			System.out.println(greeting);	
				
				
				
				
	}

}
