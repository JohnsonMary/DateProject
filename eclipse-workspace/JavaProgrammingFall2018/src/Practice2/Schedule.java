package Practice2;
import java.util.Scanner;

public class Schedule {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What day is today?");
		String day=scan.nextLine();
		String todo="";
		
		if(day.equals("Sunday")) {
			todo="Watch tv and relax at home";
		}else if (day.equals("Monday")) {
			todo="First day of work,wake up early!";
			
		}else if(day.equals("Tuesday")) {
			todo="Drop your son off the school at 8:00 a.m.";
			
		}else if(day.equals("Wednesday")) {
			todo="You have a doctor appointment at 3:00 p.m.";
		
		}else if(day.equals("Thursday")) {
			todo="Visit your grandma.";
			
		}else if(day.equals("Friday")) {
			todo="Go to the market!";
			
		}else {
			todo="Go out with your friends.";
			
		}
		
		System.out.println(todo);
		
	}

}
