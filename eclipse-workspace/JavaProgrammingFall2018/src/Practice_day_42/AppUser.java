package Practice_day_42;

public class AppUser {
	
	private   String userId;
	private  String name;
	private String password;
	private   int count=0;
	
	public  String getUserId() {
		return userId;
	}
	
	public  void setUserId(String userId) {
		this.userId = userId;
	}
	public AppUser() {
		count++;
		
	}
	public AppUser(String userId, String name, String password) {
		this.userId = userId;
		this.name = name;
		this.password = password;
		count++;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public  int getCount() {
		return count;
	}
	
	public  void setCount(int count) {
		this.count = count;
	}
	
	

}
