package Practice_day42;

public class AppUser {
	
 private String userId;
 private static String name;
 private String password;
 private static int count;
 
 
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
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
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public AppUser(String userId, String name, String password) {
	this.userId = userId;
	this.name = name;
	this.password = password;
	count++;
}
public AppUser() {
	this.userId="undefined";
	this.name="undefined";
	this.password="undefined";
	count++;
	
}
 

}
