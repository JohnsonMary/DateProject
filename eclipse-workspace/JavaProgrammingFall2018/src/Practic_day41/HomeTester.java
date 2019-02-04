package Practic_day41;

public class HomeTester {
	
	public static void main(String[] args) {
		
		House myHome=new House();
		myHome.type="Single";
		myHome.year=2017;
		myHome.address="34 Fair Street,TX";
		myHome.bedrooms=6;
		
		printHouseInfo(myHome);
		
		
		
		House builtHouse=buildAHouse("22 fake ln. NY","Condo",1999,4);
		System.out.println(builtHouse.address);
		System.out.println(builtHouse.year);
		System.out.println("===============");
		printHouseInfo(builtHouse);

		
	}
	public static void printHouseInfo(House houseInf) {
		
		System.out.println("House type: "+houseInf.type);
		System.out.println("House's bedrooms: "+houseInf.bedrooms);
		System.out.println("Address -> "+houseInf.address);
		System.out.println("Year: "+houseInf.year);
		
		
	}
	
	public static House buildAHouse(String address,String type,int year,int bedrooms) {
		
		House newHome=new House();
		
		newHome.address=address;
		newHome.type=type;
		newHome.year=year;
		newHome.bedrooms=bedrooms;
		
		return newHome;
		
		
	}

}
