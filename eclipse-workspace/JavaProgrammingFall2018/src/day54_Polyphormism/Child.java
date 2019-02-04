package day54_Polyphormism;

public class Child extends Parent{

	@Override
	public void getAngry() {
		System.out.println("Child Style Anger");
	}
	
	public void beCool() {
		System.out.println("Child Stay cool");
	}
	
	
	public static void main(String[] args) {
		
	
		Parent p1 =  new Child();
		p1.getAngry();
		// Downcasting 
		Child c1 = (Child) p1 ; 
		c1.beCool();
		
		
		
	}
	
}


/*
 * 	// upcasting 
		long a = (long) 10 ; 
		// downcasting 
		int b = (int) a ;  

		
		//Parent p =  (Parent) new Child(); 
//		Child p2 = new Child();  // Child p2 , Parent p2 , Object p3
//		Parent p =  p2 ; 
		// Object Type IS-A Reference type 
 * */
