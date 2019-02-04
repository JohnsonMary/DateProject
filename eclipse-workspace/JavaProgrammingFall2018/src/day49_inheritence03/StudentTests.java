package day49_inheritence03;

public class StudentTests {
	
	public static void main(String[] args) {
		
		Student student=new Student();
		OnlineStudent onlineStudent=new OnlineStudent();
		InCampusStudent onCampusStudent=new InCampusStudent();
		
		student.attendAClass();
		onlineStudent.attendAClass();
		onCampusStudent.attendAClass();
		
		
	}

}
