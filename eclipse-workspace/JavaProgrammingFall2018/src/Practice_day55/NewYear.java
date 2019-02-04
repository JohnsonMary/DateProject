package Practice_day55;

public class NewYear extends Holiday{
	
	int dayOffCount;
	
	public void countdown_WelcomeNewBeginning() {
		
		System.out.println("4,3,2,1...0!!!");
	}
	
	@Override
    public void sendHolidayMessage() {
		
		System.out.println("Happy New Year!!!");
	}
	

}
