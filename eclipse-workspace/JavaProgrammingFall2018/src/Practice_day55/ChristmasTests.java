package Practice_day55;

public class ChristmasTests {
	public static void main(String[] args) {
		
		Holiday h1 = new Christmas();
		h1.sendHolidayMessage();
		
		Christmas c1 = (Christmas) h1;
		c1.exchangeGifts();
		
		h1.sendHolidayMessage();
		
		h1 = new NewYear();
		h1.sendHolidayMessage();
		
		NewYear n1 = (NewYear) h1;
		n1.countdown_WelcomeNewBeginning();
		
		Giftreceiver g1 = new Christmas();
		g1.giftReceived();
		
		Christmas c2 = (Christmas) g1;
		c2.giftCount=12;
		
		
		
		
		
	}

}
