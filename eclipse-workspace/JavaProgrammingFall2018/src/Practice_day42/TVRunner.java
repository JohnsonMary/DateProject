package Practice_day42;

public class TVRunner {
	public static void main(String[] args) {
		
		TV tv1=new TV("LG");
		System.out.println(tv1.getBrand());
		
		TV tv2=new TV();
		
		tv2.turnOn();
		System.out.println(tv2.isOn());
		tv1.turnOn();
		tv1.setChannel(78);
		tv2.setChannel(93);
		
		tv1.channelUp();
		tv2.channelDown();
		System.out.println(tv1.getChannel());
		System.out.println(tv2.getChannel());

		tv1.setVolumeLevel(3);
		tv2.setVolumeLevel(7);
		tv1.volumeUp();
		tv2.volumeDown();
		
		System.out.println(tv1.getVolumeLevel());
		System.out.println(tv2.getVolumeLevel());

		
	}

}
