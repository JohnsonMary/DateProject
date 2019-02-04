package Practice3;
import java.util.Scanner;

public class CybertekSchedule {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Which day is it?\n"+
		                   "1,2,3,4,5,6 or 7?");
		int day=scan.nextInt();
		
		String classAtSchool="";
		String weekdayName="";
		
		if(day==1) {
			classAtSchool="Project class";
			weekdayName="Monday";
			
		}else if(day==2) {
			classAtSchool="Java class";
			weekdayName="Tuesday";
				
		}else if(day==3) {
			classAtSchool="Java class";
			weekdayName="Wednesday";
			
		}else if(day==4) {
			classAtSchool="QA class";
			weekdayName="Thursday";
			
		}else if(day==5) {
			classAtSchool="No class";
			weekdayName="Friday";
			
		}else if(day==6) {
			classAtSchool="Java class";
			weekdayName="Saturday";
			
		}else if(day==7) {
			classAtSchool="Java class";
			weekdayName="Sunday";
			
		}else {
			System.out.println("No such a day");
		}
		System.out.println("If it is "+weekdayName+","+"\n"+
		                   "You'll have "+classAtSchool);
		
		
		
		
	}

}
