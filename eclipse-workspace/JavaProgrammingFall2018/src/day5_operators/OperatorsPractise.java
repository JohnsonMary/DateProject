package day5_operators;

public class OperatorsPractise {
	public static void main(String[]args){
		
		//declare variable apples and assign 5
		//add 10 more apples using shorthand operator
		
		//declare variable carsInLot and assign 23
		//decrease carsinLot by 10 using shorthand operator
		
		//declare variable pizzaSlices and assign 12 to it
		//divide pizzaSlices amoung 5 ppl and assign the amount
		//each person gets back to pizzaSlices
		
		int apples=5;
		apples+=10;
		System.out.println(apples);
		
		int carsInLot=23;
		carsInLot-=10;
		System.out.println(carsInLot);
		
		int pizzaSlices=12;
		pizzaSlices/=5;
		System.out.println(pizzaSlices);
		
		//declare variable minutes and assign 100 to it
		//find out how many remaining minutes that do not make another hour
		//and assign back to minutes alsa add amother variable hours
		//and assign whole hours count to it
		
		int minutes=100;
		//find out how many whole hours
        
		int hours= minutes/60;
        System.out.println("Hours: "+hours);
        
        minutes %=60; //100/60 ->remainder -> 40
        System.out.println("Remaining Minutes "+minutes);
        
        
		
		
		
	}

}
