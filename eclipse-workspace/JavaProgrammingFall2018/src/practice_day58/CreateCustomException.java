package practice_day58;

public class CreateCustomException extends Exception{
	
	public CreateCustomException() {
		
	}
	

	public static void main(String[] args) throws CreateCustomException {
		
		CreateCustomException e1 = new CreateCustomException();
		throw  e1;
		
		
	}
}
