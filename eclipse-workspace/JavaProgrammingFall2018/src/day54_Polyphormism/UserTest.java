package day54_Polyphormism;

public class UserTest {
	public static void main(String[] args) {
		
		RegularUser r1= new RegularUser(21,"John",333);
		r1.sendMessage("Hello world!");
		
		AdminUser a1=new AdminUser(32,"Akbar",true);
		a1.sendMessage("Hello students!");
		a1.activateUser("Mary");
		a1.deActivateUser("John");
		
	    r1.joinAGroup(3837);
		
	
		
		
		
		
		
	}

}
