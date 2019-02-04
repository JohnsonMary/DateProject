package day18_Loops01;

public class Car {
	public static void main(String[] args) {
		
     String smsMessage="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
		
		String sender=smsMessage.substring(8,18);
		System.out.println(sender);
		String phoneNumber=smsMessage.substring(smsMessage.indexOf("2"),smsMessage.indexOf("]"));
        System.out.println(phoneNumber);
        String message=smsMessage.substring(smsMessage.indexOf("I"),smsMessage.indexOf("}"));
		System.out.println(message);
		
		
		
		String garage="Toyota, Nissan, Honda, BMW, Mazerati, Ford";
		 garage=garage.toLowerCase();
		System.out.println(garage);
		
		if(garage.isEmpty()) {
			System.out.println("No cars in the garage");
			
		}
		
		if(garage.contains("toyota")|| garage.contains("nissan")) {
			System.out.println("There is a Japanese car in garage");
			
		}else if(!garage.contains("toyota")|| !garage.contains("nissan")) {
			System.out.println("No Japanese car");
			
		}
		
		if(garage.indexOf("bmw")>-1) {
			System.out.println("there is a german car in garage");
		}else if(garage.contains("bmw<=-1")) {
			System.out.println("No german car in garage");	
			
		}
		
		if(garage.indexOf("mazerati")>-1) {
			System.out.println("there is an italian car in garage");
		}else if(!garage.contains("mazerati")) {
			System.out.println("No italian car in garage");	
			
		}
		if(garage.indexOf("jaguar")>-1){
			System.out.println("there is a british car in garage");
			
		}else if(!garage.contains("jaguar")) {
			System.out.println("No british car");
			
		}
		
		
		
		
		
	}

}
