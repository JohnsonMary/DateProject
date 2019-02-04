package Practice_day54;

public class AdminUser extends SlackUser{
	
	boolean isOwner;
	
	public AdminUser(int age,String name,boolean isOwner) {
		
		super(age,name);
		this.isOwner=isOwner;
		
	}
	

	public  void sendmessage(String str) {
      
		System.out.println("Sending message from AdminUser: "+str);

	}
}
