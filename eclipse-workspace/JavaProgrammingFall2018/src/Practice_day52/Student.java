package Practice_day52;

public abstract class Student {
	
	int studentId;
	
	public Student (int studentId) {
		
		this.studentId=studentId;
		System.out.println("Student ID is "+studentId);
	}
	public Student() {
		
	}
	
	
	public void study() {
		System.out.println("Studying Java");
	}
	
	public abstract void goingSchool();


}
