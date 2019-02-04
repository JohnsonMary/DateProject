package justPractice;

public class TVPractice {
	public static void main(String[] args) {
		
		TV tv1=new TV("LG");
		TV tv2=new TV("Samsung");
		TV tv3=new TV("Imac");
		
	    System.out.println(tv1.getBrand());
	    System.out.println(tv2.getBrand());
		
		tv1.turnOff();
		tv2.turnOn();
		tv1.volumeUp();
		tv2.volumeUp();
		
		
		System.out.println(tv1.isOn());
		System.out.println(tv2.isOn());
		System.out.println(tv2.getVolumeLevel());
		
		tv1.channelUp();
		tv2.setChannel(25);
		System.out.println(tv2.getChannel());
		
		tv2.channelDown();
		
		tv2.turnOn();
		tv2.setVolumeLevel(3);
		
		System.out.println(tv2.getVolumeLevel());
		System.out.println(tv2.getChannel());
		
		tv1.turnOff();
		tv1.setChannel(9);
		
		System.out.println(tv1.getChannel());
		
		tv2.setVolumeLevel(11);
		System.out.println(tv2.getVolumeLevel());
		
		
		
	}

}
