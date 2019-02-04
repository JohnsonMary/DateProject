package Practice_day55;

public class HolidayUtility {
	
	public static void main(String[] args) {
		
		Holiday h1 = new Holiday();
		sendMessage(h1);
		
		Christmas c1 = new Christmas();
		Holiday h2 = c1;
		sendMessage(h2);
		
		Holiday h3 = new NewYear();
		sendMessage(h3);
		
		Christmas c2 = new Christmas();
		Giftreceiver g2 = c2;
		sendMessage(g2);
		
		
	}
	
	static void sendMessage (Holiday h) {
		
		System.out.println("Sending message from holiday utility");
		h.sendHolidayMessage();
	}
	
	static void sendMessage(Giftreceiver h) {
		System.out.println("Sending message from holiday utility,giftreceiver");
		
	}

}
