package Practice4;

public class Login {
	public static void main(String[] args) {
		
		String secretUserName="Admin";
		String secretPassword="abc123";
		
		String userName="Admin";
		String password="abc123";
		
		if(userName.equals(secretUserName) && password.equals(secretPassword)) {
			System.out.println("You logged in successfully!");
			
		}else{
			if(!userName.equals(secretUserName)&& !password.equals(secretPassword)) {
				System.out.println("ERROR:Invalid Username and Password!");
				
			}else if(!password.equals(secretPassword)) {
				System.out.println("ERROR:Invalid Password!");
				
			}else if(!userName.equals(secretUserName)){
				System.out.println("Invalid UserName");
			}
			   
			
		}
		
		
		
		
		
	}

}
