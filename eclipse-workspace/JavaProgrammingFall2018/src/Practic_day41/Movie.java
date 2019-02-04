package Practic_day41;

public class Movie {
	
	private String name,type;
	private int minutes;

	public static void main(String[] args) {
		
		Movie movie1=new Movie();
		movie1.setName("Mission Impossible");
		movie1.setType("Action");
		movie1.setMinutes(130);
		
		
		System.out.println("Movie Name: "+movie1.getName());
		System.out.println("Type: "+movie1.getType());
		System.out.println("Minutes: "+movie1.getMinutes());
		
		
		
	}
	public String getName() {
		
		return name;
	}
	public void setName(String newName) {
		
		name=newName;
	}
	
	public String getType() {
		
		return type;
	}
	public void setType(String newType) {
		
		type=newType;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int newMinutes) {
		
		minutes=newMinutes;
	}
}

