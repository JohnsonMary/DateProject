package Practice_day42;

public class TV {
	
	private int channel;
	private int volumeLevel;
	private boolean on;
	private String brand;
	
	
	public TV() {

		this.channel=1;
		this.volumeLevel=1;
		this.on=false;
		this.brand="undefined";
	}		
	public TV(String brand) {
		
		this.brand = brand;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(on==true && channel>=1 && channel<=120) {
			this.channel = channel;

		}else {
			System.out.println("ERROR:The TV is OFF or invalid channel");
		}
	}
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		
		if(on==true && volumeLevel>=1 && volumeLevel<=7) {

		this.volumeLevel = volumeLevel;
	}else {
		System.out.println("ERROR: The TV is OFF or invalid volume level");
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
		
		if(on==true) {
			System.out.println("The TV is already ON");
			
		}else {

		this.on=on;
		on=true;
		
	}
	}
	   public void turnOff() {
			if(on==false) {
				System.out.println("TV is already OFF");
				
			}else {

				this.on=on;
				on=false;
		
		}
	}
		public void channelUp() {

			if(on==true && channel<120) {
				channel++;
			}
	}
		public void channelDown() {
			
			if(on==true && channel>1) {
				channel--;
			}
		}
		public void volumeUp() {
			if(on==true && volumeLevel<7) {
				
				volumeLevel++;	
			}
		}
		public void volumeDown() {
			if(on==true && volumeLevel>1) {
				volumeLevel--;
				
			}
		}
		
		
}
	
	
	
	


