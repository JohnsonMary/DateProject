package day58_Exceptions;

public class Bird extends LivingThing {

	
	  // CAN NOT THROW NEW CHECKED EXCEPTION
    // CAN NOT THROW BROADER CHECKED EXCEPTION
    
    @Override
    public void move() throws Exception{
        
        
    }

}


class LivingThing {
    
    public void move() throws Exception{
        
    }
    
}