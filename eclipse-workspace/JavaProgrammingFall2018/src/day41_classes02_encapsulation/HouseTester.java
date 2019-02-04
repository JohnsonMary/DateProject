package day41_classes02_encapsulation;

public class HouseTester {
	public static void main(String[] args) {
		
		
		House myHouse=new House();
		myHouse.type="Castle";
		myHouse.address="34 Cedar gr. NJ";
		myHouse.year=2018;
		myHouse.bedrooms=250;
		
		
		House.printHouseInfo(myHouse);
		
		House yourHouse=new House();
		yourHouse.type="Single";
		yourHouse.address="88 Cedar gr. NY";
		yourHouse.year=2004;
		yourHouse.bedrooms=12;
		
		House.printHouseInfo(yourHouse);

		
		
		
		
		
		
	}

	

}
