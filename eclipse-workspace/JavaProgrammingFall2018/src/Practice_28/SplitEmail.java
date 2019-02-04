package Practice_28;

public class SplitEmail {
	public static void main(String[] args) {
		
		String email="info@cybertekschool.com";
		
		String splitted []=email.split("@");
		
		System.out.println(splitted.length);
		
		if(splitted.length==2) {
			System.out.println(splitted[0]);
			System.out.println(splitted[1]);
			
		}else {
			System.out.println("Invalid entry");
		}
		
		
		
		
		
		
	}

}
