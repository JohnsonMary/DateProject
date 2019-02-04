package Practice2;
import java.util.Scanner;

public class grades1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Which grade did you get?\n"+
		                   "50,65,75 or 90?");
		                   
		
		int grade=scan.nextInt();
		String comment="";
		if (grade==50) {
			comment="Fail";
		}else if(grade==65) {
			comment="Acceptable";
		}else if(grade==75) {
			comment="Good";
		}else if(grade==90) {
			comment="Excellent!";
		}
		System.out.println(comment);
		
		
		
	}

}
