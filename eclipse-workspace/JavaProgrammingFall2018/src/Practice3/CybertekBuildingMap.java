package Practice3;
import java.util.Scanner;

public class CybertekBuildingMap {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Which floor?\n"+
		                   "1,2,3 or 4?");
		int floor=scan.nextInt();
		if(floor==1) {
			System.out.println("Lobby");
			
		}else if(floor==2) {
			System.out.println("Google");
			
		}else if(floor==3) {
			System.out.println("Cybertek");
			
		}else if(floor==4) {
			System.out.println("Apple");
			
		}else {
			System.out.println("ERROR:There is no such floor");
		}
		
		
		////
		
		switch(floor) {
		case 1:
			System.out.println("Lobby");
			break;
		case 2:
			System.out.println("Google");
			break;
		case 3:
			System.out.println("Cybertek");
			break;
		case 4:
			System.out.println("Apple");
			break;
		default:
			System.out.println("ERROR:Invalid floor");
			break;
		
		
		
		}
		
		
		
	}

}
