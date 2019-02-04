package day17_Review2;
import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How month are you?");
		double months=scan.nextInt();
		int year=(int)months/12;
		int remainingMonths=(int)(months%12);
		    
		
		if(months<0) {
			System.out.println("Unborn");
			
		}else if(months<1.0) {
			System.out.println("You're a neonate and "+(months/0.25)+" weeks old");
			
		}else if(year<=1) {
			System.out.println("You're a "+months+" months old infant");
			
		}else if(year>=1 && year<=3 ) {
			System.out.println("You're a "+year+" years old toddler");
			
		}else if(year>3 && year<=5 ) {
			System.out.println("You're a "+year+" years old pre=school child");
			
		}else if(year>6 && year<=12) {
			System.out.println("You're a "+year+" years old school aged child ");
			
		}else if(year>=13 && year<=18) {
			System.out.println("You're a "+year+" years old adolescent");
			
		}else if(year>=19 && year<=40) {
			System.out.println("You're a "+year+" years old young adult");
			
		}else if(year>=41 && year<=65) {
			System.out.println("You're a "+year+" years old middle age adult");
			
		}else if(year>65) {
			System.out.println("You're a "+year+" years old older adult");
			
		}System.out.println("Months: "+remainingMonths);
		
		
		
		
		
		
	}

}
