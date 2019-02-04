package day54_Polyphormism;

public class AdminUser extends SlackUser{

	boolean isOwner;
	
	public AdminUser(int age,String name,boolean isOwner) {
		super(age,name);
		this.isOwner=isOwner;
		
	}
	
	public void activateUser(String name) {
		
		System.out.println(name+" is an activated student");
	}
	
	public void deActivateUser(String name) {
		
		System.out.println(name+" is a deactivated student");
	}
	

	@Override
	public void sendMessage(String str) {
        System.out.println("Admin user sends message "+str);		
	}
}