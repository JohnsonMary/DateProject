package Practice_day54;

public class RegularUser extends SlackUser{
	
	int groupNumber;
	
	public RegularUser(int age,String name, int groupNumber) {

	    super(age,name);
		this.groupNumber=groupNumber;
	}
	
	public void joinAGroup(int groupNumber) {
		
		System.out.println("The students with group number: "+groupNumber+" just joined");
		
		
	}
	@Override
	public  void sendmessage(String str) {

		System.out.println("Sending message from Regular User: "+str);
	}

}
