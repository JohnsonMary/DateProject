package Practice_day_31;

public class MethodsWithReturn {
	public static void main(String[] args) {
		
		giveMe5$();
		System.out.println(giveMe5$());
		
		int b=giveMe5$();
		System.out.println(b);
		
		getPresidentName();
		
		System.out.println(getPresidentName());
		String president=getPresidentName();
		System.out.println(president);
		
		System.out.println(whatIsYourName());
		String myName=whatIsYourName();
		System.out.println(myName);
		
		String getNames=firstName()+lastName();
		
		String email=getNames+"@.gmail.com";
		System.out.println(email);
		
		String fName=firstName();
		String lName=lastName();
		
		 email=fName+"_"+lName+"@hotmail.com";
		System.out.println(email);
	
		
		
	}

	public static int giveMe5$() {
		int a=5;
		return a;
		
	}
	public static String getPresidentName() {
		
		String name="Donald Trump";
		return name;
		
	}
	public static String whatIsYourName() {
		
		String myName="Mary";
		return myName;
	}
	
	public static String firstName() {
		
		String getName="Mary";
		return getName;
	}
	public static String lastName() {
		
		String getLastName="Johnson";
		return getLastName;
	}

}