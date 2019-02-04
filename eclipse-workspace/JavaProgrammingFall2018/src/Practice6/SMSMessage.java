package Practice6;

public class SMSMessage {
	public static void main(String[] args) {
		
	String sm="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
    String sender=sm.substring(sm.indexOf("M"),sm.indexOf(">"));
    System.out.println("Sender is "+sender);
    
    String phoneNumber=sm.substring(sm.indexOf("[")+1,sm.indexOf("]"));
    System.out.println("Phone number is "+phoneNumber);
    
    String message=sm.substring(sm.indexOf("{")+1,sm.indexOf("}"));
    System.out.println("Message is "+"'"+message+"'");
		
		
		
		
	}

}
