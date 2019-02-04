package Practice_day_42;

public class TVRunner {
	
	public static void main(String[] args) {
		
		TV myTV=new TV();
		TV smartTV=new TV("LG");
		TV cakeTV=new TV("Samsung");
		
		System.out.println(myTV.isOn());
		System.out.println(smartTV.isOn());
		System.out.println(cakeTV.isOn());
		
		myTV.turnOn();
		smartTV.turnOn();
		cakeTV.turnOn();
		
		System.out.println(myTV.isOn());
		System.out.println(smartTV.isOn());
		System.out.println(cakeTV.isOn());
		
		myTV.setChannel(115);
		smartTV.setChannel(19);
		
		System.out.println(myTV.getChannel());
		System.out.println(smartTV.getChannel());
		System.out.println(cakeTV.getChannel());

		myTV.channelUp();
		smartTV.channelDown();
		
		System.out.println(myTV.getChannel());
		System.out.println(smartTV.getChannel());
		System.out.println(cakeTV.getChannel());
		
		cakeTV.turnOff();
		
		cakeTV.setChannel(47);
		
		
		


		

		
		
		
		
		
		
	}

}
