package day47_accessModifiers_02;

import day47_accessModifiers_01.Student;

public class OtherPackage {
	public static void main(String[] args) {
		
		Student s1=new Student();
	    s1.name="Mary";
	    Student s2=s1;
	    System.out.println(s1.name);
	    System.out.println(s2.name);
	    
	    s1.name="Jack";
	    System.out.println(s1.name);
	    System.out.println(s2.name);
	     
		
		
	}

}
