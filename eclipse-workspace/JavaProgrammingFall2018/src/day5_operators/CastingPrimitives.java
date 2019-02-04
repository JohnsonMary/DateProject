package day5_operators;

public class CastingPrimitives {
	public static void main(String[] args) {
		
		int i=100;
		byte b=(byte)i;
		System.out.println(i);
		
		double price=12.5;
	    int price2=(int)price;
	    System.out.println(price2);
	    
	    //implicit casting examples
	    int count =45566;
	    double doubleCount=count;
	    System.out.println(doubleCount);
	    
	    byte byteValue=127;
	    int value=byteValue;
	    System.out.println(value);
	    
	    //Explicit Casting
	    
	    int students=70;
	    byte byteStudents=(byte)students;
	    System.out.println(byteStudents);
		
	    double priceOfBook=635.99;
	    int intPrice=(int)priceOfBook;
	    System.out.println(intPrice);
	    
	    String numStr="2345";
	    System.out.println(numStr+5+2);
	    
	    double d=123.6;
	    int n=(int)d;
	    System.out.println(n);
	    
	    
		
	}
	
	

}
