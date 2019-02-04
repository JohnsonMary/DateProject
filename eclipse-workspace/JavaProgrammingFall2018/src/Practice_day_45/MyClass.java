package Practice_day_45;

public class MyClass {
	static int num1=100;
	int num2=200;
	
	
	static {
		
		num1=num1+5;
	}
	
	{
		num2=num2+10;
	}
	
	public MyClass() {

		num1+=10;
		num2+=10;
	}
}
