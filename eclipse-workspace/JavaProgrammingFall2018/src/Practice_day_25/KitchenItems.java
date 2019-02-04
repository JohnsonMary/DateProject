package Practice_day_25;

public class KitchenItems {
	public static void main(String[] args) {
		
		String kitchenItems[]= {"knife","woOden spoons","Plates"};
		System.out.println("Enter smtg");
		
		
		for( String items:kitchenItems) {
			
			System.out.print(items+",");
			
			
			switch (items.toLowerCase()) {
			case "knife":
				System.out.println("It's used to cut");
				break;
			case "wooden spoons":
				System.out.println("It's used to mix the food");
				break;
			case "plates":
				System.out.println("To put food on it");
				break;
			
			
			
			
			
			
			}
			
		}
		
		
		
		
	}

}
