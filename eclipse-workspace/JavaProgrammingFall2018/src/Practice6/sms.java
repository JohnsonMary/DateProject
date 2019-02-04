package Practice6;

public class sms {
	public static void main(String[] args) {
		
		String sm="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
		
		String sender=sm.substring(sm.indexOf("<")+1,sm.indexOf(">"));
		String phoneNumber=sm.substring(sm.indexOf("[")+1,sm.indexOf("]"));
		String message=sm.substring(sm.indexOf("I"),sm.indexOf("}"));
		
		System.out.println("The sender is: "+sender);
		System.out.println("The phone number is: "+phoneNumber);
		System.out.println("The message is: "+message);
		
		
	}

}
