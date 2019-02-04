package day57_Exceptions;

public class TryFinally {

	public static void main(String[] args)  {
System.out.println("program started");
        
        try {
            playWithWater() ;
        } catch (RuntimeException e) {
            System.out.println("got ya");
        }
        
        // playWithFire() ;
        System.out.println("program ended");
        
    
	}
    public static void playWithWater() throws RuntimeException {
        
        System.out.println(  " playWithWater message " );
        throw new RuntimeException("playing with hot water");
        
    }

    public static void playWithFire() throws Exception {
        
        
    }

}