package day55_Polymorphism_Casting;

public class Christmas extends Holiday implements GiftReceiver{

	int giftCount;
	

	public void exchangeGifts() {
		
		System.out.println("Let's exchange gifts!!");
	}
	
	@Override
	public void sendHolidayMessage() {
		System.out.println("Happy Christmas!!");
		
	}

	@Override
	public void giftReceived() {

		System.out.println("Gift is received in Christmas!");
	}
	
	

}
