package day41_classes02_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class House {
	
	String type,address;
	int bedrooms,year;
	
	
	

	public static void main(String[] args) {
		
		House home1=new House();
		House home2=new House();
		House home3=new House();
		House whiteHouse=new House();
		
		home1.type="Single";
		home2.type="Apartment";
		home3.type="Condo";
		whiteHouse.type="Single";
		
		home1.address="10 Rogers Pl. Bloomfield,NJ";
		home2.address="55 Star st. Clifton,NJ";
		home3.address="120 white road Wayne,NJ";
		whiteHouse.address="334 kalm rd.,WA";
		
		home1.bedrooms=4;
		home2.bedrooms=3;
		home3.bedrooms=6;
		
		home1.year=1980;
		home2.year=1961;
		home3.year=2016;
		
		
		System.out.println("First house which has "+home1.bedrooms+" bedrooms is a "+home1.type+" house");
		System.out.println("Second house's address is "+home2.address+"; which is built in "+home2.year);
		
		int [] nums=new int[4];
		nums[0]=344;
		
	    String[] names=new String[4];
	    names[0]="Bill";
	    
	    House EsqersHouse=new House();
	    EsqersHouse.type="Townhouse";
	    EsqersHouse.address="4322 Jones rd.,VA";
	    EsqersHouse.bedrooms=3;
	    EsqersHouse.year=1980;
	    
	    
	    
	    
		House[] houses=new House[5];
		houses[0]=home1;
		houses[1]=home2;
		houses[2]=home3;
		houses[3]=whiteHouse;
		houses[4]=EsqersHouse;
		
		System.out.println(houses[0].address);
		System.out.println("===================");
		
		for(House h:houses) {
			
			
			System.out.println("House type: "+h.type+"->"+h.address);
			
			
		}
		System.out.println();
		
		for(int i=0; i<houses.length;i++) {
			
			System.out.println(houses[i].address+houses[i].type);
			
		}
		System.out.println("=============");
		ArrayList<Integer> numsList=new ArrayList<>();
	    ArrayList<House> housesList=new ArrayList<>();
	    
	    housesList.add(home1);
	    housesList.add(home2);
	    housesList.add(home3);
	    housesList.add(whiteHouse);
	    housesList.add(EsqersHouse);
	    
	    ArrayList<House>houseList2=new ArrayList<>(Arrays.asList(houses));
	    List<House>houseList3=Arrays.asList(houses);
	    
	    for(House l:housesList) {
	    	
	    	if(l.year>=1980 && l.year<=2010) {
	    		
	    		System.out.println("The house year between 2006-2016: "+l.address);
	    		
	    	}
	    	
	    	
	    	
	    }
	    for(int j=0; j<housesList.size();j++) {
	    	
	    	House tempHouse=housesList.get(j);
	    	
	    	if(tempHouse.year>=1980 && tempHouse.year<=2010) {
	    		
	    		System.out.println(tempHouse.year+" | "+tempHouse.address);
	    		
	    	}
	    	
	    	
	    	
	    	
	    }

	    House newHouse=new House();
	    newHouse.type="Single";
	    newHouse.address="76 hello st. NY";
	    newHouse.bedrooms=8;
	    newHouse.year=2017;
	    
	    House returnHouse=buildHouse("Single","76 hello st. NY",8,2017);
	   System.out.println(returnHouse.address);
	   printHouseInfo(returnHouse);
	   
	   
		
		
		
		
		
		
	}


    public static void printHouseInfo(House house) {
	
	System.out.println("================");
	System.out.println("Type: "+house.type);
	System.out.println("Address: "+house.address);
	System.out.println("Bedrooms: "+house.bedrooms);
	System.out.println("Year: "+house.year);
	System.out.println("=================");
	
	
}

    public static House buildHouse(String type,String address,int rooms,int year) {
	
	    House newHouse=new House();
	    newHouse.type=type;
	    newHouse.address=address;
	    newHouse.bedrooms=rooms;
	    newHouse.year=year;
	    
	    return newHouse;
	   
    }

}
