package day31_MethodsWithReturn;

public class MethodsWithReturn {
	public static void main(String[] args) {
		
		String firstName=getFirstName();
		String lastName=getLastName();
		String email=firstName+"_"+lastName+"@gmail.com";
		System.out.println(email);
		
		email=getFirstName()+"_"+getLastName()+"@yahoo.com";
		System.out.println(email);
		
		int amount=giveme5$();
		System.out.println(amount);
		
		System.out.println(giveme5$());
		
		String president= getPresidentName();
		System.out.println(president);
		System.out.println("The president is "+president);
		System.out.println(getPresidentName());
		
		String myName=whatisYourName();
		System.out.println(myName);
		
		
		
		
	}

	public static int giveme5$() {
		int d = 5;
		return d;
		
		
	}

	public static String getPresidentName() {
		return "Donald Trump";
		
	}


	public static String whatisYourName() {
	 	String name = "Mary";
		return name;
		
		
	}

	public static  String getFirstName() {
		
		return "Mike";
		
		
	}
		
		
		
	
	
	public static String getLastName () {
		
		return "Jake";

	
	
}

}






