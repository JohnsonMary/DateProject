package HomeWork;

import day47_accessModifiers_01.Student;

public class OnlineStudent extends Student{
	//name and studentID
	int webinarID;
	

	
	public OnlineStudent() {
		super();
		System.out.println("No arg from online student");
		
	}
	public void attendClassOnline() {
		
		System.out.println("Students are attending online to the class");
	}
	
	public OnlineStudent(String name,int webinarID ) {
		
		this.name=name;
		this.webinarID=webinarID;
		

		
	}
}
