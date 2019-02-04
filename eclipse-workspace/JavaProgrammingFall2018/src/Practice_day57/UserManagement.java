package Practice_day57;

public class UserManagement {
	public static void main(String[] args) {
		
		createUserName("hdndhdhdhddddd");
		
		
		
		
	}
	
	public static void createUserName(String name) {
		
		try {
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(3));
		
		char [] charArray = name.toCharArray();
		
		System.out.println(charArray[9]);
		
		System.out.println(Integer.parseInt(name.substring(0, 1)));
		
		}catch(NullPointerException e) {
			System.out.println("caught NullPointerException");
			
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("caught ArrayIndexOutOfBoundsException");
			
		}catch(NumberFormatException n) {
			System.out.println("caugth NumberFormatException");
			
		}finally {
			System.out.println("this is finally block");
		}
		
		
	}

}
