package practice_40;

public class Employee {
	
	String firstName,lastName,jobTitle,email;
	double hourSalary;
	
	
	public void work() {
		
		System.out.println(firstName+" "+lastName+" works as "+jobTitle+" in a big company.She is very successfull at her job.");
	}
	
	public void getPaid() {

		System.out.println(firstName+" gets $"+hourSalary+" per hour.");
		
	}		
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		e1.firstName="Mary";
		e1.lastName="Johnson";
		e1.jobTitle="SDET";
		e1.email=e1.firstName+e1.lastName+"@gmail.com";
		e1.hourSalary=65.50;
		
		e1.work();
		e1.getPaid();
		
		
		
		
	}
}
