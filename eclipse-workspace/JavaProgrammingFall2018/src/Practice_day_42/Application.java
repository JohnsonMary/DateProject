package Practice_day_42;

public class Application {
	public static void main(String[] args) {
		
		AppUser user1=new AppUser("ironman","Jack Smith","dgheye2");
		AppUser user2=new AppUser("superman","Han Mack","87hshs");
		AppUser user3=new AppUser("postman","Hay Kello","88sjsj");
		
		user1.setCount(55);
		System.out.println(user1.getCount());
		System.out.println(user2.getCount());
		System.out.println(user3.getCount());

		
		AppUser user4=new AppUser();
		System.out.println(user4.getCount());
		
		System.out.println(user1.getUserId());
		System.out.println(user2.getUserId());
		
		System.out.println(user1.getName());
		
	
		
		
		
	}

}
