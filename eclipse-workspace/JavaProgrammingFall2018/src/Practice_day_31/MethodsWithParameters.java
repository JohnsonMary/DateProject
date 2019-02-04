package Practice_day_31;

public class MethodsWithParameters {
	public static void main(String[] args) {
		
		int max=getMax3(3,43,1);
		System.out.println(max);
		
		System.out.println(getMax3(56,4,16));
		
		String email=buildEmail("Mary","Johnson");
		System.out.println(email);
		
		System.out.println(buildEmail("John","Doe"));
		
		int maximum=getMax(34,26);
		System.out.println(getMax(3,4));
		
		boolean dayy=isValidDay("Tuesday");
		System.out.println(dayy);
		System.out.println(isValidDay("Wednessday"));
		System.out.println("======================");
		
		System.out.println(validDay("tuesday"));
		System.out.println("===============");
		System.out.println(validDayy("wednesday"));
		System.out.println(validDayy("funday"));
		
		String star=getStars(5);
		System.out.println(star);
		System.out.println(getStars(25));

		
		
	}
	public static int getMax3 (int num1,int num2,int num3) {

		int largest=0;
		
		if(num1>=num2 && num1>=num3) {

			largest=num1;
		}else if(num2>=num1 && num2>=num3) {
			largest=num2;
			
		}else {
			largest=num3;
		}
		
		 return largest;
		 
	}
	    
	public static String buildEmail(String firstName,String lastName) {

		String email=firstName+lastName+"@gmail.com";
		return email;

		
	}		
	public static int getMax(int num1,int num2) {
		
		int larger=0;
		
		if(num1>num2) {
			larger=num1;
		}else {
			larger=num2;
		}
        return larger;
		
	}
	public static boolean isValidDay(String day) {

		String dayy=day.toLowerCase().trim();
		
		switch (day) {
		
		case "Sunday":
		    return true;
		case "Monday":
			return true;
		case "Tuesday": 
			return true;
		case "Wednesday":
			return true;
		case "Thursday":
			return true;
		case "Friday":
			return true;
		default:
			return false;
			
			}
		}
		
	public static boolean validDay(String day) {
		
		
		String [] days= {"Sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		
		String dayss=day.toLowerCase();
		
		for(int i=0;i<days.length;i++) {
			
			
			if(days[i].equals(day)) {
			
			return true;
			}
			
				
			}return false;

		
	    	
	    }
	
	public static boolean validDayy(String day) {
		
		String dayy=day.toLowerCase();
		if(day.equals("sunday")|| day.equals("monday")|| day.equals("TUESday")|| day.equals("wednesday")|| day.equals("thursday")||day.equals("friday")||day.equals("saturday")) {
			
			return true;
		}else {
			return false;
		}
	}
	
	public static String getStars(int num) {
		String stars="";

		for(int i=0; i<=num;i++) {
			
			stars=stars+"*";
			
		}return stars;
	}
		
	    }	
			
	
		

		


