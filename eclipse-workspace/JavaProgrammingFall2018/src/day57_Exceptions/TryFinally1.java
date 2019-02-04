package day57_Exceptions;

public class TryFinally1 {
	public static void main(String[] args) {
		
		System.out.println("Program started");
		
		try {
			playWithWater();
			playWithFire();
			
		}catch(RuntimeException e) {
			System.out.println("got ya");
			
		}catch(Exception e) {

			System.out.println("Caught exception");
		}
		
		System.out.println("Program ended");
		
		
		
		
	}
	
	public static void playWithWater() throws RuntimeException{
		
		System.out.println("playWithWater message");
		throw new RuntimeException("playing with hot water");
	}
	
	public static void playWithFire() throws Exception{
		
		
	}

}
