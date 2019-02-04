package day25_Arrays02;

public class WarmUpTask {
	public static void main(String[] args) {
		
		String [] kitchenItems= {"knife","wooden spoons"," plates","cups","forks","pan",
				          "pot ","rash can","frige","dishwasher"};
		
		for(String item:kitchenItems) {
			
			switch (item.toLowerCase().trim()){
			case "knife":
				System.out.println("Knife is used for cutting vegetables");
				break;
			case "wooden spoons":
				System.out.println("Wooden spoons are used to mix the food");
				break;
			case "plates":
				System.out.println("It's used to put some food on it");
				break;
			case "cups":
				System.out.println("It's use to put drink inside");
				break;
			case "forks":
				System.out.println("Its's used to eat something");
				break;
			case "pan":
				System.out.println("It's used to cook");
				break;
			case "pot":
				System.out.println("It's used to cook in it");
				break;
			case "trash can":
				System.out.println("It's used to put garbage in it");
				break;
			case "fridge":
				System.out.println("It's used to put food inside to keep them cool");
				break;
			case "dishwasher":
				System.out.println("It's used to wash the dishes");
				break;
			default:
				System.out.println("It's not in the list");
				break;
				
				
				
				
				
				
				
				
				
				
			}
			
		}
				          
		
		
		
		
		
	}

}
