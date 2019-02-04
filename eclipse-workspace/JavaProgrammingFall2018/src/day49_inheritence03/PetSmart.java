package day49_inheritence03;

public class PetSmart extends Store{
	
	public PetSmart() {
		super("Pet Store");
		System.out.println("PetSmart no args constructor");
		
	}
	public PetSmart(double rent) {
		
		super("Pet Store",rent);
		System.out.println("PetSmart Constructor with 1 arg");
	}


}
