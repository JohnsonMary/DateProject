package justPractice;

public class Student {
	
	protected String name;
	protected int studentID;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public void study() {
		
		System.out.println("Studying");
		System.out.println("Name: "+this.name+" "+"Student ID: "+this.studentID);
				
	}
	public Student(String name, int studentID) {
		this.name=name;
		this.studentID=studentID;
		System.out.println(this.name+" "+this.studentID);
		
	System.out.println("No arg from student");
	}
	public Student() {
		
	}

}
