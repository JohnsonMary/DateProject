package day11_switchCase;
import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Select the day:\n"+
		                   "1.Sunday\n"+
				           "2.Monday\n"+ 
		                   "3.Tuesday\n"+
				           "4.Wednesday\n"+
		                   "5.Thursday\n"+
				           "6.Friday\n"+
		                   "7.Saturday");
		int day=scan.nextInt();
		String school="";
		String weekDayName="";
		
		
	    if(day==2) {
	    	school="Group Project";
	    	weekDayName="Tuesday";
	    	System.out.println("It's Monday and Group Project class");
	    			
			
		}else if(day==3) {
			school="Java";
			weekDayName="Wednesday";
			System.out.println("It's Tuesday and Java class");
			
		}else if(day==4) {
			school="Java";
			weekDayName="Thursday";
			
		}else if(day==5) {
			school="QA Class";
			weekDayName="Friday";
		}else if(day==6) {
			school="No class";
			weekDayName="Saturday";
			
			
		}else if(day==7) {
			school="Java";
			weekDayName="Sunday";
		}else {
			System.out.println("ERROR:Invalid day");
		}
	         
		
		System.out.println("Day of the week: "+weekDayName+"\n"+"Class: "+school);
		System.out.println("If it is "+weekDayName+",you have "+school);
		
		
		
		
		
		
	}

}
