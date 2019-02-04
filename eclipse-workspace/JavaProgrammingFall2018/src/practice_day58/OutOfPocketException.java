package practice_day58;

public class OutOfPocketException extends Exception{

	
	public OutOfPocketException() {
		
	}
	
	public static void main(String[] args) throws OutOfPocketException{
		
		OutOfPocketException ex1 = new OutOfPocketException();
		throw ex1;
		
		
		
	}
	
}
