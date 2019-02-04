package day54_Polyphormism;

public class RegularUser extends SlackUser{
	
	int groupNumber;
	
	public RegularUser(int age,String name,int groupNumber) {
		super(age,name);
		this.groupNumber=groupNumber;
		
	}
	
	public void joinAGroup(int groupNumber) {
		
		System.out.println("The student with groupnumber: "+groupNumber+" just joined" );
		this.groupNumber=groupNumber;
	}

	@Override
	public void sendMessage(String str) {
		System.out.println("Regualr user sent message "+str);
	}

		

}
