package Practice6;
import java.util.Scanner;

public class loop2Numbers {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int nextNum=input.nextInt();
		
		int total=0;
	while(nextNum>0) {
		total=total+nextNum;
		nextNum=input.nextInt();
		
	}System.out.println("The total is "+total);

		System.out.println("number?");
		int num=input.nextInt();
		while(num>0) {
			total=total+num;
			num=input.nextInt();
			
		}System.out.println("Total is "+total);
		
		
		
		
	}

}
