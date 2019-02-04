package Practice_day55;

public class MainRunner {
	public static void main(String[] args) {
		
		Person p1 = new Person("Mary",37);
		
		Object o1 = new Person("Lola",28);
		
		printPerson(p1);
		printPerson(o1);
		
		
		
		

	}
	public static void printPerson(Person p) {
		
		System.out.println("Printing person");
		
	}
	
	public static void printPerson(Object o) {
		
		System.out.println("Printing object");
		
		Person p1 = (Person) o;
		
	    printPerson(p1);
	    
	    System.out.println("Second person called");
	    System.out.println(o);
	    
	    if(o instanceof  Person) {
	    	Person p = (Person) o;
	    	System.out.println(p.getAge());
	    }else {
	    	System.out.println("WHAT you passed is not a person");
	    }

		
	}
	
	
	
	
	

}
