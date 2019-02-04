package Practice2;

public class RangeTests {
	public static void main(String[] args) {
		int students=65;
				
		int onlineStudents=students-60;
		
		
		if(students>=5 && students<30) {
			System.out.println("Lets do mentoring session");
			
		}else if(students>=30 && students<=60) {
			System.out.println("Lets have a lecture");
			
		}else if(students>60) {
			System.out.println(onlineStudents+" students can take the classess online");
			
		}
		
	}

}
