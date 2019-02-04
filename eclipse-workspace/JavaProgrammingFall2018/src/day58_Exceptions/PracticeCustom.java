package day58_Exceptions;

public class PracticeCustom {
	public static void main(String[] args) throws PocketOutOfMoneyException{
		
	
	PocketOutOfMoneyException e = new PocketOutOfMoneyException("SOME CUSTOM MESSAGE") ; 
	throw e ; 

   }

}


class PocketOutOfMoneyException extends NullPointerException {


public PocketOutOfMoneyException() {
	System.out.println("NO ARG ");
}

public PocketOutOfMoneyException(String s) {
	super(s) ; 
}


}


