package day43_Static_Constructor02;

public class CampusTester {
	public static void main(String[] args) {
		
		Campus.city="New York";
		Campus.aboutCampus();
		
		Campus c=new Campus();
		System.out.println(c.city);
		c.aboutCampus();
		
		
		
		
	}

}
