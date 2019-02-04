package Practice4;
import java.util.Scanner;

public class StartAndEnd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the starting point");
		char sp=scan.next().charAt(0);
		System.out.println("Enter the ending point");
		char ep=scan.next().charAt(0);
		
		if(sp==ep) {
			System.out.println("You're already there");
			
		}else if(!(sp>='A'&& sp<='D')&& (ep>='A' && ep<='D')) {
			System.out.println("Invalid points");
		}else if(sp=='A') {
			if(ep=='B') {
				System.out.println("Go right");
				
			}else if(ep=='C') {
				System.out.println("Go left,go down");
				
			}else if(ep=='D') {
				System.out.println("Go right,down,go left,up");
				
		}else if(sp=='B') {
			if(ep=='A') {
				System.out.println("Go left");
			
			}else if(ep=='C') {
				System.out.println("Go down");
					
			}else if(ep=='D') {
				System.out.println("Go down,go left");
				
		}else if(sp=='C') {
			if(ep=='A') {
				System.out.println("Left,up");
				
			}else if(ep=='B') {
				System.out.println("Keft,up,right");
				
			}else if(ep=='D') {
				System.out.println("Left");
				
		}else if(sp=='D') {
			if(ep=='A') {
				System.out.println("Up");
				
			}else if(ep=='B') {
				System.out.println("Up,left");
				
			}else if(ep=='C') {
				System.out.println("Left");
				
			}
			
		}
			
		}
			
		}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
