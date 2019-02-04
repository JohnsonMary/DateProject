package Practice_day_45;

public class Blocks {
	
	static int num=100;
	static String str;
	
	
	static {
		
		System.out.println("static block");
		num=num+1000;
		str="Hello";
	}
	
	{
		System.out.println("init block");
		num=num+500;
		str=str+" world";
	}
	public Blocks() {
		
		System.out.println("Constructor");
		str=str+"!!!";
	}

}
