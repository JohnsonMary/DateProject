package justPractice;

public class LocalStudent extends Student{
	
	int seatID;
	
	public LocalStudent() {
		
		super("Somename",123);
		System.out.println("No arg from local student");
		
	}
	public void attendClassInPerson() {
		
		System.out.println("Students are attending to the class in campus");
	}
	public LocalStudent(int seatiD) {
		this();
		this.seatID=seatID;
		System.out.println("Constructor from 1 arg local student");
		
		
	}

}
