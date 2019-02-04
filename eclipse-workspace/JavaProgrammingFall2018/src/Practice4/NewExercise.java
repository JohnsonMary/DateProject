package Practice4;
import java.util.Scanner;

public class NewExercise {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your username");
		String name=scan.nextLine();
		
		String email="pinarercans@gmail.com.";
		
        int point=email.indexOf("@");
        System.out.println(point);
        String start=email.substring(11);
        int end=email.lastIndexOf(".");
        System.out.println(end);
        
        System.out.println("Your new email adress is: "+name+email.substring(11,end ));
        
       
		
		
		
		
		
		
		
		
	}
	
	
}
