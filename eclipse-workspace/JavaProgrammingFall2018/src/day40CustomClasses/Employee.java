package day40CustomClasses;

public class Employee {
	
	String firstName;
	String lastName;
	String email;
	String jobTitle;
	double hourlySalary;
	
	public void work() {
		
		System.out.println(firstName+" "+lastName+" is working as "+jobTitle+" in a big company.");

	}
	

	public static void main(String[] args) {
		
		/*Employee emp1=new Employee();
		emp1.firstName="Mike";
		emp1.lastName="Smith";
		emp1.email=emp1.firstName+emp1.lastName+"@gmail.com";
		emp1.jobTitle="Scrum Master";
		emp1.hourlySalary=65.50;
		
		System.out.println("Firstname: "+emp1.firstName);
		System.out.println("Lastname: "+emp1.lastName);
		System.out.println("Email: "+emp1.email);
		System.out.println("Job title: "+emp1.jobTitle);
		*/
	}

}
