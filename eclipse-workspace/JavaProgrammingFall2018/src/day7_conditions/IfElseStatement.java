package day7_conditions;

public class IfElseStatement {
	public static void main(String[] args) {
	  double coffeePrice=8.50;
	  
	  
	  if(coffeePrice<6.0) {
		  System.out.println("I will get coffee");
		  
	  }else {
		  System.out.println("I will not get coffee.Too expensive");
	  }
	  
	  double accountBalance=450.50;
	  double price=700;
	  //if you have enough money you buy the item
	  //otherwise you say not enough balance
	  
	  if(accountBalance>=price) {
		  System.out.println("I have enough money");
		  System.out.println("I am ordering online");
		  
		  
	  }else {
		  System.out.println("Not enough balance");
		  System.out.println("Lets wait for paycheck");
		  
		  
	  }
	  
	 /*2 variables:speedLimit,currentSpeed
	  *if current speed is more than 20 mph compared to speed limit
	  *than you are getting a speeding ticket'
	  *otherwise keep driving.
	  */
	  int speedLimit,currentSpeed;
	  speedLimit=55;
	  currentSpeed=75;
	  
	  if(currentSpeed>speedLimit+20) {
		  System.out.println("Hey slow down!");
		  System.out.println("I will get a ticket");
		  
		  
	  }else {
		  System.out.println("Good job!");
		  System.out.println("Keep driving");
		  /*
		   * 
		   */
		  boolean isPrime;
		  if(isPrime=true) {
			  System.out.println("The shipping is 0.0");
			  
	      }else {
	    	  System.out.println("The shipping is 7.99");
	    	  
	      }
		  
		  
		  
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	 
			
		}
		
		
		
	}


