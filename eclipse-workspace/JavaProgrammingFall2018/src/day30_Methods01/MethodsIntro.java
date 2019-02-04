package day30_Methods01;

import Practice_Day31.Calculator;

public class MethodsIntro {
	
	public static void main(String[] args) {
		
		askHowRU();
		reply();
		sayBye();
		sayHelloTo("Mary");
		
		
		
	}
	
	public static void sayHelloTo(String name) {
		
		System.out.println("Hello "+name+"!");
		
		
	}

   public static void askHowRU() {
	   
	   System.out.println("How are you doing?");
	   
   }
   public static void reply() {
	   
	   System.out.println("I'm doing well, how about you bro?");
	   
   }
   
   public static void sayBye() {
	   
	   System.out.println("Bye! Have a good day!");
	   
   }
   
   
}
