package day9_conditionals3;

public class RangeTests {
	public static void main(String[] args) {
		int students=10;
		
		if(students>=5 && students<30) {
			System.out.println("lets do mentoring session");
			
		}else if(students>=30 && students<=60) {
			
			System.out.println("Lets have a lecture");
		}else if(students>60) {
			
			int online=students-60;
			
			System.out.println(online+" students need to join class online");
			
		}else {
			System.out.println("Students need to be more than or equal to 5");
		}
		
	}

}
