package justPractice;

public class Application {
	public static void main(String[] args) {
		
		AppUser user1=new AppUser("ironman","Mark Smith","93hjsh");
		AppUser user2=new AppUser("superman","Sar Sarma","hy36");
		AppUser user3 =new AppUser("postman","Jack Wilson","nsh376");
		
		user1.setCount(100);
		
		System.out.println(user1.getCount());
		System.out.println(user2.getCount());
		System.out.println(user3.getCount());
		
		AppUser user4=new AppUser();
		System.out.println(user4.getCount());
		
		System.out.println(user1.getUserId());
		System.out.println(user2.getUserId());

		
		
		
		
		
		
		
	}

}
