package Practice6;
import java.util.Scanner;

public class GiveMe5Dollars {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int money;
		int tries=0;
		
		do {
			System.out.println("Give me 5 dollars");
		    money=scan.nextInt();
		    tries++;
		    if(tries==3) {
		    	System.out.println("Ok,thanks!");
		    	break;
		    	
		    }
		}while(money!=5);
		    System.out.println("Thank you for $5!");
		    
		
		
		
		
	}

}
