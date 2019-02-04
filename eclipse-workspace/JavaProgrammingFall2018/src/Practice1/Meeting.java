package Practice1;
import java.util.Scanner;

public class Meeting {
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Hello!What is your name?");
		String name=scan.nextLine();
		
		System.out.println("Nice to meet you!"+name);
		System.out.println("How old are you?");
		String age=scan.nextLine();
		
		System.out.println("Are you really "+age+"?"+" You are too young "+name+"!");
		System.out.println("Thank you so much!What about you?");
        String age2=scan.nextLine();
        
        System.out.println("We are almost at the same age.Have a nice day! ");
		
			
		
	}

}
