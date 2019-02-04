package Practic_day41;

import java.util.ArrayList;

public class HouseBuilder {
	public static void main(String[] args) {
		
		House home1=new House();
		House home2=new House();
		House home3=new House();
		House home4=new House();
		
		home1.type="Apartment";
		home1.address="3422 Lee Highway,NJ";
		home1.bedrooms=3;
		home1.year=1980;
		
		home2.type="Condo";
		home2.address="63 Kaplan Highway,NY";
		home2.bedrooms=5;
		home2.year=2010;
		
		home3.type="Single";
		home3.address="98 Common ln.,NJ";
		home3.bedrooms=6;
		home3.year=2017;
		
		home4.type="Castle";
		home4.address="76 5th street,NY";
		home4.bedrooms=15;
		home4.year=1975;

		
		System.out.println("House1 Type -"+home1.type);
		System.out.println("House 2 Type -"+home2.type);
		System.out.println("House 3 Type -"+home3.type);
		System.out.println("House 4 Type -"+home4.type);

		House homeArray[]=new House [4];
		homeArray[0]=home1;
		homeArray[1]=home2;
		homeArray[2]=home3;
		homeArray[3]=home4;

		System.out.println("Third house's address: "+homeArray[2].address);
		
		for(int i=0; i<homeArray.length;i++) {
			
			System.out.println("House "+i+"->"+homeArray[i].address);
			
		}
		
		for(House eachHome:homeArray) {
			
			System.out.println("House type ->"+eachHome.type+" , bedroom number is "+eachHome.bedrooms);
		}

		ArrayList<House>houseList=new ArrayList();
		houseList.add(home1);
		houseList.add(home2);
		houseList.add(home3);
		houseList.add(home4);

		for(House eachHouse:houseList) {
			
			if(eachHouse.year>=2010 && eachHouse.year<=2018) {
				
				System.out.println("The houses which built in 2010-2018 years: "+eachHouse.year);
			}

			
			
			
		}
		
		for(int j=0; j<houseList.size();j++) {
			
			System.out.println("House "+(j+1)+" address-> "+houseList.get(j).address);
			
		}
		
		
		
	}

}
