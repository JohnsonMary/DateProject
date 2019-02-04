package day54_Polyphormism;

public class PhoneTests {
	public static void main(String[] args) {
		
		Phone p1 = new CellPhone();
		p1.makeCall();
		//System.out.println(p1.isTouchScreen); will not work because Phone doesn't see.
		System.out.println(p1.buttonCount);
		
	//	p1.texting(); will not work
		
		
		
	}

}
