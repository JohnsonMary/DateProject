package Practice_day42;

import java.util.ArrayList;

public class HomeForRent {
	public static void main(String[] args) {
		
		Home home1=new Home();
		home1.type="Condo";
		home1.year=2000;
		home1.bedrooms=3;
				
		System.out.println(home1.type);
		System.out.println(home1.year);
		
		Home home2=new Home();
		home2.type="Single";
		home2.year=2010;
		home2.bedrooms=5;
		
		Home [] str=new Home [2];
		str[0]=home1;
		str[1]=home2;
		
		for(int i=0; i<str.length;i++) {
			
			System.out.print(str[i].type+" ");
			
		}
		for(Home str1:str) {
			
			System.out.print(str1.year+" ");
			
		}
		
		ArrayList<Home>homeList=new ArrayList();
		homeList.add(home1);
		homeList.add(home2);
		
		for(int i=0; i<homeList.size();i++) {
			
			System.out.println(homeList.get(i).bedrooms+" ");
			
		}
		System.out.println();
		
		for(Home eachHome:homeList) {
			
			System.out.println(eachHome.type+" ");
			
		}
		
		houseInfo(home2);
		System.out.println();
		
		System.out.println((buildAHouse("condo",1981,6).type));
		
		
		
		
		
	}
	public static void  houseInfo(Home home1) {
		
		
		System.out.println( "Type: "+home1.type+" Year: "+home1.year+" Bedrooms: "+home1.bedrooms);
	}
	public static Home buildAHouse(String type,int year,int bedrooms) {
		Home home4=new Home();
		home4.type=type;
		home4.year=year;
		home4.bedrooms=bedrooms;
		
		return home4;
		
		
	}

}
