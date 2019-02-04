package Practice1;
import java.util.Scanner;

public class Cat {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter how many minutes did your cat live?");
	    int minutes=scan.nextInt();
	    
	    int hours,days,months,years;
	    years=minutes/(60*24*30*12);
	    minutes%=(60*24*30*12);
	    
	    months=minutes/(60*24*30);
	    minutes%=(60*24*30);
	    
	    days=minutes/(60*24);
	    minutes%=(60*24);
	    
	    
	    hours=minutes/60;
	    minutes%=60;
	    int min=minutes;
	    
	    
	   System.out.println("Your cat lived "+years+" years,");
	   System.out.println(months+" months,");
	   System.out.println(days+" days,");
	   System.out.println(hours+" hours.");
	   System.out.println(min+" minutes.");
	    
	    
	    
	    
		
		
			
				
		
	}

}
