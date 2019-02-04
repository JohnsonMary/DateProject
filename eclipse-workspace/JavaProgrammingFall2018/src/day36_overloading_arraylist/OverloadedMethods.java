package day36_overloading_arraylist;

public class OverloadedMethods {
	public static void main(String[] args) {
		
		System.out.println(playGame("soccer",16));
		
		System.out.println(playGame(14,"football"));
		System.out.println(work("sdet"));
		System.out.println(work(64));
		
	}
	
	public static boolean playGame(String game,int players) {
		
		System.out.println("Playing < "+game+"> with <"+players+">players");

		return players>=2;
	}
	
	public static boolean playGame(int players,String game) {
		System.out.println("Playing < "+game+"> with <"+players+">players");

		return players>=2;

	}
	public static boolean work(String jobType) {
		
System.out.println("Working as "+jobType+" is fun!");

return jobType.equalsIgnoreCase("sdet")||jobType.equalsIgnoreCase("developer");
		

	}
	public static double work(int hours) {
	
		double salary=hours*60;
		System.out.println("Worked "+hours+" hours and made "+salary+" income");
	
	    return salary;
		
	}
	
}


