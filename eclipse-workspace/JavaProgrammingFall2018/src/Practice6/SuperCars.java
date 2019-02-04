package Practice6;

public class SuperCars {
	public static void main(String[] args) {
		
		String garage="Toyota,Nissan,Honda,BMW,Mazerati,Ford";
		garage=garage.toLowerCase();
		
		if(garage.isEmpty()) {
			System.out.println("Garage is empty");
			
		}
		
		if(garage.contains("toyota")||garage.contains("nissan")) {
			System.out.println("There is a japanese car in the garage");
			
		}else {
			System.out.println("No Japanees cars");
		}

		if(garage.indexOf("bmw")>-1) {
			System.out.println("German car");
			
		}else {
			System.out.println("No German car");
		}
		
		if(garage.indexOf("maze")>-1) {
			System.out.println("Italian car");
		}else {
			System.out.println("No Italian car");
		}

		if(garage.indexOf("jaguar")>-1) {
			System.out.println("British car");
		}else {
			System.out.println("No British car");
		}

		
	}

}
