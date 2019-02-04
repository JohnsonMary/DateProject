package day46_this_isa;

public class Messaging {
	public static void main(String[] args) {
		
		Message msg1=new Message("Hello!","Marufjon","Akbar");
		Message msg2=new Message("Java is fun....");
		Message msg3=new Message("This keyword is interesting","Shahin");
		Message msg4=new Message();
		
		System.out.println(msg1.toString());
		System.out.println(msg2.toString());
		System.out.println(msg3.toString());
		System.out.println(msg4);

		
		
		
	}

	
	
}
