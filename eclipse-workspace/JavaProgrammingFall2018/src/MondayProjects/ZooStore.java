package MondayProjects;

public class ZooStore {

	public static void main(String[] args) {
		
		Animal dog=new Animal();
		Animal cat=new Animal();
		Animal horse=new Animal();
		
		dog.setName("Fluffy");
		cat.setName("Cutie");
		horse.setName("Firtina");
		
		dog.setWeight(120);
		cat.setWeight(150);
		horse.setWeight(200);
		
		dog.setColor("Brown");
		cat.setColor("White");
		horse.setColor("Gold");
		
		Animal [] animalList=new Animal [3];
		
		animalList[0]=dog;
		animalList[1]=cat;
		animalList[2]=horse;
		
		
		for(int i=0; i<animalList.length;i++) {
			
	        if(animalList[i].getColor().toLowerCase().startsWith("w")) {
	        	 
	        	 System.out.println(animalList[i].getName());
	         }

		}
				
		
		
		
		
	}
	

}
