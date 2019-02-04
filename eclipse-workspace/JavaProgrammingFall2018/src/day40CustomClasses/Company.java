package day40CustomClasses;

public class Company {
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		
		emp1.firstName="Mike";
		emp1.lastName="Smith";
		emp1.email=emp1.firstName+emp1.lastName+"@gmail.com";
		emp1.jobTitle="Scrum Master";
		emp1.hourlySalary=65.50;
		
		emp2.firstName="Mary";
		emp2.lastName="Johnson";
		emp2.email=emp2.firstName+emp2.lastName+"@gmail.com";
		emp2.jobTitle="SDET";
		emp2.hourlySalary=62.50;
		
		
		System.out.println("Employee-1 email: "+emp1.email);
		System.out.println("Employee-2 email: "+emp2.email);
		
		emp2.work();
		emp1.work();
		
	}

}
