package Practice6;

public class Cars {
	public static void main(String[] args) {
		
		String garage="Toyota,Nissan,Honda,BMW,Mazerati,Ford";
		garage=garage.toLowerCase();
		System.out.println(garage);
		
		if(garage.isEmpty()) {
			System.out.println("No cars in garage");
			
		}
		
		if(garage.contains("toyota")||garage.contains("nissan")) {
			System.out.println("There is Japaneese car in garage");
			
		}else {
			System.out.println("No  Japaneese cars");
		}
		
		if(garage.indexOf("bmw")>-1) {
			System.out.println("German car");
			
		}else {
			System.out.println("No German car");
		}
		
		if(garage.indexOf("Mazerati")>-1) {
			System.out.println("Italian car");
			
		}else {
			System.out.println("No Italian car");
		}
		
		if(garage.indexOf("jaguar")>-1) {
			System.out.println("British car");
			
		}else if(garage.indexOf("jaguar")==-1) {
			System.out.println("No British car");
			
		}
	}

}
