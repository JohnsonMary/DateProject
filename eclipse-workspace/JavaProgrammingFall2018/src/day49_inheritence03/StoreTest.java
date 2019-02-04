package day49_inheritence03;

public class StoreTest {
	public static void main(String[] args) {
		
		Store store1= new Store("Grocery");
		Store store2= new Store(10000.0);
		Store store3= new Store("Computer Store",5122.32);
		
		System.out.println("=========PETSMART OBJECTS============");
		
		PetSmart pet1=new PetSmart();
		PetSmart pet2=new PetSmart(37373);
		
		System.out.println("Petstore1 type: "+pet1.getType());
		System.out.println("Petstore1 type: "+pet2.getType());
		
		System.out.println("Petstore1 rent: "+pet1.getRent());
		System.out.println("Petstore1 rent: "+pet2.getRent());

		
		
		
	}

}
