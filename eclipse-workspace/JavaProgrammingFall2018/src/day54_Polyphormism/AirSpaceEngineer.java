package day54_Polyphormism;

public class AirSpaceEngineer extends MyStudent{

public static void main(String[] args) {
		
		MyStudent m1 = new AirSpaceEngineer(); 
		m1.study();
	  //m1.designSpaceShip();does not work because MyStudent class doen't have that method.
		
	}
	
	@Override
	void study() {
		System.out.println("airspace study");
	}
	void designSpaceShip() {
		
	}
	void launchARocket() {
		
	}
	

}


class MyStudent {
	
	
	void study() {
		System.out.println("generic study");
	}
	
	
}


