package Practic_day41;

public class Flower {
	
	private String color,type;
	private int howMany;

	
	public String getColor() {
		
		return color;
	} 
	public void setColor(String newColor) {
		
		color=newColor;
	}
	public String getType() {
		
		return type;
	}
	public void setType(String newType) {
		
		type=newType;
		
		
	}
	public int getHowMany() {
		return howMany;
	}
	public void setHowMany(int newMany) {

		howMany=newMany;
	}	
	
	public static void main(String[] args) {
		
		Flower flower1=new Flower();
		
		flower1.setColor("Yellow");
		flower1.setType("Chamomile");
		flower1.setHowMany(25);
		
		
		System.out.println("Type: "+flower1.getType());
		System.out.println("Color: "+flower1.getColor());
		System.out.println("Count: "+flower1.getHowMany());
		
		Flower flower2=new Flower();
		
		flower2.setColor("Red");
		flower2.setType("Rose");
		flower2.setHowMany(31);
		
		System.out.println("Type: "+flower2.getType());
		System.out.println("Color: "+flower2.getColor());
		System.out.println("Count: "+flower2.getHowMany());
		
		
		
		
		
		
	}
}
