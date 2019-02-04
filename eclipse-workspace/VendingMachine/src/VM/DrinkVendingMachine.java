package VM;
import java.util.*;
public class DrinkVendingMachine extends VendingMachine{
	 /**
     * HAS-A relation
     * DrinkVendingMachine HAS-A list of Drink objects
     */
    public List<Drink> drinks;

    /**
     * current will refer to currently selected drink
     */
    public Drink current;
    /**
     * after selecting the drink, whatever amount customer owes for the drink
     */
    public double amountLeftToPay;
    /**
     * after paying for the drink whatever amount is change
     */
    public double change;
    /**
     * used to check if drink is currently selected or no
     */
    public boolean isSelected;

    /**
     * public constructor.
     * @param drinksParam VAR-ARGs.
     *                    Assign each Drink object into drinks list
     */
    public DrinkVendingMachine(Drink... drinksParam) {
       //TODO
           	
    	drinks=new ArrayList<>();
    	for(Drink d:drinksParam) {
    		drinks.add(d);
    	}

    }

    /**
     * Override select abstract method.
     * This method will be used to select a drink in the vending machine
     * @param drinkNumber to select in Vending machine
     *                    options are 0 to drinks.size-1
     * 1. if drinkNumber is < 0 or more than drinks.size-1
     *       then isSelected should be false
     * 2. if a drink's quantity at that position is <=0
     *       then isSelected should be false
     * 3. Set the drink object at that index to current variable
     * 4. Set the cost of the selected drink to amountLeftToPay variable
     * 5. Set isSelected to true
     *
     */

    @Override
    public void select(int drinkNumber) {    
    
    	if(drinkNumber<0 || drinkNumber>drinks.size()-1) {
    	
    		isSelected = false;
    	}
    	
    	if(drinks.get(drinkNumber).getQuantity()<=0) {
    		isSelected=false;
    		
    	}
    	
    		current=drinks.get(drinkNumber);
    		amountLeftToPay=drinks.get(drinkNumber).getCost();
    		isSelected = true;
    }
  
    
    
    /**
    *
    * Override abstract method pay
    * Method is used to pay for the selected drink
    *
    * 1. If isSelected is false then return 0.0
    * 2. Deduct money from amountLeftToPay
    * 3. if there is any change set the value to change variable (positive value)
    * 4. Decrease the quantity of the selected drink by 1
    * 5. Return amountLeftToPay value
    *
    * @param money
    *
    */
   
	@Override
	public double pay(double money) {

		if(isSelected==false) {
			return 0.0;
		}
				
		    amountLeftToPay=amountLeftToPay-money;
		    
            change=money-amountLeftToPay;
			current.setQuantity(current.getQuantity()-1);
			
			amountLeftToPay=amountLeftToPay-money;
			return 0;
			
		}
		
	

	 /**
     * Override abstract method returnChange
     * Method is used to return the change to the customer
     * Return the value of change from the method and
     * 1. Set change to 0
     * 2. Set amountLeftToPay to 0
     *
     * @return
     */

	@Override
	public double returnChange() {

		
		 change=0;
		 amountLeftToPay=0;
		 return 0;
		
	}

	 /**
     * Override abstract method cancel
     * Method is used by customers to cancel any selected drinks
     * 1. set current drink to null
     * 2. amountLeftToPay is zero
     * 3. isSelected to false
     * 4. return any changes
     */

	@Override
	public void cancel() {
		
		current=null;
		amountLeftToPay=0;
		isSelected=false;
	    returnChange();
	 
		
	}
	public static void main(String[] args) {
		DrinkVendingMachine vending = new DrinkVendingMachine(
                new Drink("Iced Coffee",4.50,10),
                new Drink("Iced Tea",2.50,5),
                new Drink("Smart Water",4.0,20),
                new Drink("Coke",2.30,13) );
    
   System.out.println( vending.drinks.get(0).toString() ); //Drink{name='Iced Coffee', cost=4.5, quantity=10}
   vending.select(1);
   
   
  }
}
	
    
    
    

    