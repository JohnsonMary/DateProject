package day37_arrayList02;

import java.util.ArrayList;

public class Cities {
	public static void main(String[] args) {
		
		
		ArrayList <String>cities=new ArrayList<>();
		
		cities.add("Bloomfield");
		cities.add("Clifton");
		cities.add("Paterson");
		cities.add("Woodland Park");
		cities.add("Elmwood Park");
		cities.add("Wayne");
		cities.add("Totowa");
		cities.add("Little Falls");
		cities.add("Lincoln Park");
		cities.add("Montclair");
		cities.add("Garfield");
		cities.add("Lodi");
		cities.add("Verona");
		cities.add("Cedar Grove");
		cities.add("Caldwell");

		
		System.out.println(cities);
		System.out.println("The count of cities: "+cities.size());
		ArrayList <String>longNames=new ArrayList <>();
		
		for(int i=0; i<cities.size();i++) {
			System.out.print(cities.get(i)+"|");
			
			
			if(cities.get(i).length()>6) {
				
			longNames.add(cities.get(i));
				
				
			}
	

		}
		System.out.println();
		System.out.println("============");
		
		for(String k:longNames) {
			System.out.print(k+"-");
			
		}
		System.out.println();
		longNames.clear();
		System.out.println(longNames.isEmpty());
		
		for(String city:cities) {
			longNames.add(city);
		}

		System.out.println(longNames);

		
		
		

		
	}
	

}
