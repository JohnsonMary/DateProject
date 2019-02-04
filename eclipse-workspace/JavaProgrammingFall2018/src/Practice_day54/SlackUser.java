package Practice_day54;

public abstract class SlackUser {
	
	int age;
	String name;
	
	public SlackUser(int age,String name) {
		
		this.age=age;
		this.name=name;
		
	}
	
	public abstract void sendmessage(String str);

}
