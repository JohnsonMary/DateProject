package Practice_day_42;

public class TV {
	
	private int channel=1;
	private int volumeLevel=1;
	private boolean on=false;
	private String brand;
	
	
	public TV() {
		
		System.out.println("Constructor with no args");
	}
	
	public TV(String brand) {
		
		this.brand=brand;
		System.out.println("Constructor with one arg");
		
		
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(on==true && channel>=1 && channel<=120) {
			
			this.channel = channel;
		}else {
			
			System.out.println("ERROR:TV is OFF or invalid channel" );
		}
	}
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		if(on==true && volumeLevel>=1 && volumeLevel<=7) {
			
			this.volumeLevel = volumeLevel;

		}else {
			System.out.println("ERROR:TV is OFF or invalid volume level" );

		}
	}
	public boolean isOn() {
		return on;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void turnOn() {
		
		if(isOn()) {
			System.out.println("TV is already ON");
		}else {
			
			on=true;
		}

	}
	public void turnOff() {
		
		if(isOn()) {
			
			on=false;
			
		}else {
			
			System.out.println("TV is alreday OFF");
		}
	}
	public void channelUp() {
		
		if(isOn() && channel<=120) {
			
			channel++;
			
		}
	}
	public void channelDown() {
		
		if(isOn() && channel>1) {
			
			channel--;
		}
	}
	public void volumeUp() {
		
		if(isOn() && volumeLevel<7) {
			volumeLevel++;
			
			
		}
	}
    public void volumeDown() {
		
		if(isOn() && volumeLevel>1) {
			volumeLevel--;
			
			
		}

    }	
}
  