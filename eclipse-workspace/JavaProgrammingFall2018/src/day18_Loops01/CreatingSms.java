package day18_Loops01;

public class CreatingSms {
	public static void main(String[] args) {
		
		
		String smsMessage="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
		
		String sender=smsMessage.substring(8,18);
		System.out.println(sender);
		String phoneNumber=smsMessage.substring(smsMessage.indexOf("2"),smsMessage.indexOf("]"));
        System.out.println(phoneNumber);
        String message=smsMessage.substring(smsMessage.indexOf("I"),smsMessage.indexOf("}"));
		System.out.println(message);
		
		
		
	}

}
