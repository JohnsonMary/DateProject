package Practice3;
import java.util.Scanner;

public class RangeTests {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
	    System.out.println("How many students are there?");
	    int students=scan.nextInt();
	    
	    if(students>=5 && students<=30) {
	    	System.out.println("Lets do mentoring session");
	      	
	   }else if(students>=30 && students <=60) {
		   System.out.println("Lets have a lecture");
		   
	   }else if(students>60) {
		   int online=students-60;
		   System.out.println(online+" students need to get courses online.");
		   
	   }
	    

	}

}
