package day55_Polymorphism_Casting;

public class ChristmasTests {
	public static void main(String[] args) {
		
	
	Holiday h1= new Christmas();
	h1.sendHolidayMessage();
	
	Christmas c1 = (Christmas) h1;  //h1's type is still Christmas ,it never changes.
	c1.exchangeGifts();  //that way I can reach out exchangeGiftsMethod.
	
	h1 = new NewYear();
	h1.sendHolidayMessage();
	
	NewYear n1 =  (NewYear) h1 ;
	n1.countdown_WelcomeNewBeginning();
	
    GiftReceiver g1 = new Christmas();
    g1.giftReceived();
    
    Christmas c2 = (Christmas) g1;
    //c2.giftCount=12;
    
	
	
	

	}

}
