package day55_Polymorphism_Casting;

public class HolidayUtility {
	public static void main(String[] args) {
		
	
		Holiday h1 = new Holiday();
		sendMessage(h1);
		
		Christmas c1 = new Christmas();
		Holiday h2 = c1;
		sendMessage(h2);
		
		Holiday h3 = new NewYear();
		sendMessage(h3);
		
		System.out.println(h1);
	}
	
		
	
		static void sendMessage(Holiday h) {
			
			System.out.println("Sending message from utility");
			h.sendHolidayMessage();
			
		}
		
        static void sendMessage(GiftReceiver h) {
			
			
			
		}
		



}
