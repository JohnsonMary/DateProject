package Practice_Repl_it;

public class PersonSpecific {
	public static void main(String[] args) {
		
		Person person=new Person();
		person.setName("John");
		person.setLastName("Doe");
		person.setAge(44);

		System.out.println(person.toString() ); // "John | Doe | 44"
		
		Person person1 = new Person("Fatima", "Lee", 22);

		System.out.println(person1.getFirstName()); //"Fatima"
		System.out.println(person1.getLastName());  //"Lee"
		System.out.println(person1.getAge());       // 22
		System.out.println(person1.toString());     //"Fatima | Lee | 22"


		Person person2 = new Person();

		System.out.println(person2.getFirstName()); //"undefined"
		System.out.println(person2.getLastName());  //"undefined"
		System.out.println(person2.getAge());       // -1
		System.out.println(person2.toString());     //"undefined | undefined | -1"



		
		
		
	}

}
