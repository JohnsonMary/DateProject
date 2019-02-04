package Practice3;

public class New {
	public static void main(String[] args) {
		
		int floor=3;
		
		switch(floor) {
		case 1:
			System.out.println("Lobby");
			break;
		case 2:
			System.out.println("Google");
			break;
		case 3:
			System.out.println("Cybertek");
			break;
		case 4:
		    System.out.println("Apple");
		    break;
		default:
			System.out.println("No such floor");
			break;
			 
		
	}
	     int price=110;
	     String status=" ";
		status=(price>=1 && price <=50)?"Cheap":(price>=51 && price<=100)?"Expensive":"Not buying";
		
		System.out.println(status);
		
		
		
	}

}
