package day54_Polyphormism;

public class CellPhone extends Phone {

	int buttonCount=25;
	boolean isTouchScreen;
	
	@Override
	public void makeCall() {
    System.out.println("Calling with my cell phone"+super.buttonCount);
		
	}
	
	public void texting() {
		System.out.println("Texting with Cell phone");
	}
	
	
}


