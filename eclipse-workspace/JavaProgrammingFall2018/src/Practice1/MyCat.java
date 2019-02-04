package Practice1;
import java.util.Scanner;

public class MyCat {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How many minutes has your cat live?");
	    int minutes=scan.nextInt();
	    int a,b,c,d;
	    a=60;
	    b=24;
	    c=30;
	    d=12;
	    
	    int years,months,days,hours,min;
	    years=minutes/(a*b*c*d);
	    minutes%=(a*b*c*d);
	    months=minutes/(a*b*c);
	    minutes%=(a*b*c);
	    days=minutes/(a*b);
	    minutes%=(a*b);
	    hours=minutes/a;
	    minutes%=60;
	    min=minutes;
	    
	    System.out.println("Your cat has lived ");
	    System.out.println(years+" years,");
	    System.out.println(months+" months,");
	    System.out.println(days+" days,");
	    System.out.println(hours+" hours and ");
	    System.out.println(min+" minutes.");
		
	}

}
