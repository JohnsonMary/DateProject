package Practice2;
import java.util.Scanner;

public class flower {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Select a number\n"+
		                   "1.Rose\n"+
				           "2.Daisy\n"+
		                   "3.Tulip\n"+
				           "4.Lilac\n"+
		                   "5.Begonia\n"+
				           "6.Magnolia");
		
		int num=scan.nextInt();
		String color="";
		
		if(num==1) {
			color="Red";
			
		}else if(num==2) {
			color="Yellow";
			
		}else if(num==3) {
			color="Blue";
		
		}else if (num==4) {
			color="Purple";
		}else if (num==5) {
			color="Orange";
		}else if(num==6) {
			color="Pink";
			
		}else {
			color="We don't have any other flowers,sorry";
		}
		System.out.println(color);
		
	}

}
