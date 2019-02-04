package practic_day_27;

public class email {
	public static void main(String[] args) {
		
		String email= ("infocybertekschool.com");
		
			
		String splitted[]=email.split("@");
		if(splitted.length==2) {
		
		System.out.println("Email id: "+splitted[0]);
		System.out.println("Email domain: "+splitted[1]);
		}else {
			System.out.println("Invalid email");
		}
		
		
		
		
	}

}
