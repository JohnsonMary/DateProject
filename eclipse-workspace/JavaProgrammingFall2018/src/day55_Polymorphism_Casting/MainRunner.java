package day55_Polymorphism_Casting;

//Create MainRunner class with main method 
	// Create a method printPerson that take Person return nothing
	// Create overloading method that take object and return nothing
	
	// in main method 
	// Create a Person Object with Object reference 
	// Create a Person object with Person reference 
	
	// try to pass your object to the method and see which one 
	// will be called 
	
	// OPTIONAL : inside your second method try to access
	// person related methods other than toString 
	
public class MainRunner {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Jack",22);
		Object p2 = new Person("Serik",27);
		
		Person p3 = (Person) p2; 
		printPerson(p1);
		printPerson(p3); // Great example!!
		
		
		
	}
	
	public static void printPerson(Person p) {
		System.out.println("First printperson is being used");
		System.out.println(p);
		
	}

	

	 /*   public static void printPerson(Object o) {
		
		System.out.println("Second person called");
		System.out.println(o);
		
		if( o instanceof Person ) { 
			Person p =  (Person) o ;
			System.out.println(p.getAge());
		}else {
			System.out.println("WHAT YOU PASSED IS NOT A PERSON");
		}
	} 
*/
	
	
}
	
	
	
	


