package Practice_day_25;

public class KitchenTools {
	public static void main(String[] args) {
		
		String kitchenTools[]= {"knife","Wooden spoons","pLates"};
		
		for(String tools:kitchenTools) {
			
			System.out.print(tools.toLowerCase()+",");
		

	
		switch (tools) {
		
		case "knife":
			System.out.println("To cut the vegetables");
			break;
		case "wooden spoons":
			System.out.println("To mix the food");
			break;
		case "plates":
			System.out.println("To put food in it");
			break;
		default:
			System.out.println("It's not in the list");
			break;
		}
		
		
		
		
		
		
		}
		
		
		
		
		
	}

}
