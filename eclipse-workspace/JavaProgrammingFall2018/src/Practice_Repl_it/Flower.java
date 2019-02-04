package Practice_Repl_it;

public class Flower {
	
	private String name;
	private String color;
	private int howMany;
	
	public String getName() {
return name;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public String getColor() {
		
		return color;
	}
	public void setColor( String color) {
		
		this.color=color;
		
	}

	public int getHowMany() {
		return howMany;
	}
	
	public void setHowMany(int howMany) {
		
		this.howMany=howMany;
		
	}
	
	public Flower() {
		
		this.name="unknown";
		this.color="unknown";
		this.howMany=0;
	}
	public Flower(String name,String color,int howMany) {
		
		this.name=name;
		this.color=color;
		this.howMany=howMany;
		
		
	}
}
