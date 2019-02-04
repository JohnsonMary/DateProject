package Practice2;
import java.util.Scanner;

public class pickAFlower {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("1.Rose\n"+
				           "2.Daisy\n"+
		                   "3.Tulip\n"+
				           "4.Lilac\n"+
		                   "5.Begonia\n"+
				           "6.Magnolia\n"+
		                 
		                   "Select a number");
		int num=scan.nextInt();
		String color="";
		if(num==1) {
			color="Red";
			
		}else if (num==2) {
			color="Yellow";
			
		}else if(num==3) {
			color="Blue";
			
		}else if(num==4) {
			color="Purple";
			
		}else if (num==5) {
			color="Orange";
			
		}else if(num==6) {
			color="Pink";
						
		}
		System.out.println(color);	

		
				           
		
				
				
				
				
	}

}
