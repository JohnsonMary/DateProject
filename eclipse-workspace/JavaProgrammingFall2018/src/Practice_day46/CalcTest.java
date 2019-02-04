package Practice_day46;

public class CalcTest {
	public static void main(String[] args) {
		
		Calc c=new Calc();
		c.plus(10);
		System.out.println(c.getResult());
		
		c.plus(90).plus(40).minus(10);
		System.out.println(c.getResult());
		
		
		
		
	}

}
