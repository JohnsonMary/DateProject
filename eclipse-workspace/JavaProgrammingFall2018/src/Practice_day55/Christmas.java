package Practice_day55;

public class Christmas extends Holiday implements Giftreceiver{
	
	int giftCount;
	//String name;
	
	public void exchangeGifts() {
		System.out.println("Let's exchange gifts!!");
	}
	
	@Override
	public void giftReceived() {
		System.out.println("Gift is received in Christmas!");
	}
	
	@Override
    public void sendHolidayMessage() {
		
		System.out.println("Happy Christmas!!!");
	}
	
	
	
	
	

}
