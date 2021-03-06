package day61_Collection;

import java.util.*;

public class MapOfMultipleValue {
	
	public static void main(String[] args) {
		
		// Store students group with members in the map
		
		Map <String, List<String> > groupMap = new HashMap<>();
		
		List <String> ty1Lst = Arrays.asList("Heydar","Leron","Kasim");
		List <String> ty2Lst = Arrays.asList("Esqer","Oguz");
		List <String> ty3Lst = Arrays.asList("Dzhamol","Mesut","Sefkat","Tarik");
		
		groupMap.put("Tyson One", ty1Lst);
		groupMap.put("Tyson Two", ty2Lst);
		groupMap.put("Tyson Three", ty3Lst);
		
		System.out.println( groupMap.get("Tyson Three"));
		System.out.println( groupMap.get("Tyson Three").get(1));
		
		/// KEY TYPE CAN NOT BE MUTABLE
		
		// Stimulate teh excel reading by row and by column
		// We need to be able to go to ROW    ---> Index List
		// We need to be able to go to COLUMN ---> So we can get value
		
		 List< Map<String,String>  > excelSheet = new ArrayList<>();
	        
	        Map<String,String> cellMap1 = new HashMap<>();
	                           cellMap1.put("A", "Adam"); 
	                           cellMap1.put("B", "25"); 
	                           cellMap1.put("C", "Male");
	        
	                           excelSheet.add(cellMap1) ; 
	                           
	        Map<String,String> cellMap2 = new HashMap<>();
	                           cellMap2.put("A", "JOHN"); 
	                           cellMap2.put("B", "27"); 
	                           cellMap2.put("C", "Male"); 
	        
	                           excelSheet.add(cellMap2) ; 
	                           
	        Map<String,String> cellMap3 = new HashMap<>();
	                           cellMap3.put("A", "MARY"); 
	                           cellMap3.put("B", "22"); 
	                           cellMap3.put("C", "Female");
	        
	                           excelSheet.add(cellMap3) ; 
	                           
	        System.out.println( excelSheet );
	        
	        System.out.println( excelSheet.get(2).get("A") );
	        
	}
}
	        