package Practice4;
import java.util.Scanner;

public class VendingMachineChange {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("How much does the item cost?Please choose: 25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100");
		int price=scan.nextInt();
        int dollars,quarters,dimes,nickels,money,cents;
        
        
     
        money=100-price;
        dollars=money/100;
		money%=100;
		
		quarters=money/25;
		money%=25;
		
		dimes=money/10;
		money%=10;
		
		nickels=money/5;
		money%=5;
		
		cents=money;
		
		
		
		System.out.println("Your change is "+quarters+" quarters "+dimes+" dimes "+nickels+" nickels "+cents+" cents");
			
		
		
		
		
		
	}
	
	

}
