package day43_Static_Constructor02;

public class TvAdjustment {
	public static void main(String[] args) {
		
		TV myTV=new TV();
		
		TV smartTV=new TV("LG");
		TV cakeTV=new TV();
		
		System.out.println(myTV.isOn());
		System.out.println(smartTV.isOn());
		System.out.println(cakeTV.isOn());
		
		myTV.turnOn();
		smartTV.turnOn();
		cakeTV.turnOn();
		
		System.out.println(myTV.isOn());
		System.out.println(smartTV.isOn());
		System.out.println(cakeTV.isOn());
		
		myTV.turnOn();
		
		myTV.setChannel(150);
		smartTV.setChannel(55);
		
		System.out.println(myTV.getChannel());
		System.out.println(smartTV.getChannel());
		System.out.println(cakeTV.getChannel());

		myTV.channelUp();
		smartTV.channelDown();
		
		System.out.println(myTV.getChannel());
		System.out.println(smartTV.getChannel());
		
		

		
		
		
	}

}
