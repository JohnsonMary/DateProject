package Practic_day41;

import java.util.ArrayList;

public class Car {
	
	String brand,color;
	int year,numberOfSeats;
	
	public static void main(String[] args) {
		
		Car car1=new Car();
		
		car1.brand="Mercedes";
		car1.color="Black";
		car1.year=2016;
		car1.numberOfSeats=7;
		
		Car car2=new Car();
		
		car2.brand="BMW";
		car2.color="White";
		car2.year=2018;
		car2.numberOfSeats=5;
		
		Car car3=new Car();
		
		car3.brand="Audi";
		car3.color="Navy blue";
		car3.year=2017;
		car3.numberOfSeats=7;
		
		Car car4=new Car();
		
		car4.brand="Lexus";
		car4.color="Burgundy";
		car4.year=2018;
		car4.numberOfSeats=2;
		
		System.out.println("The third car is a "+car3.brand+", color is "+car3.color+" , year is "+car3.year);
		
		Car [] carArray=new Car[4];
		
		carArray[0]=car1;
		carArray[1]=car2;
		carArray[2]=car3;
		carArray[3]=car4;

		System.out.println(car1.brand);
		
		for(Car eachCar:carArray) {
			
			System.out.print(eachCar.brand+" ");
			
		}
		System.out.println("======================");
		
		for(int i=0;i<carArray.length;i++) {
			
			System.out.println("The brand -> "+carArray[i].brand);
			System.out.println("The color: "+carArray[i].color);
			
		}
		
		ArrayList <Car> carList=new ArrayList<>();
		
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car4);

		System.out.println("-----------------------");
		for(Car onlyCar:carList) {
			
			System.out.println("The brand is: "+onlyCar.brand);
			System.out.println("The year is: "+onlyCar.year);
			
			
		}
		System.out.println("------------------------");
		for(int j=0;j<carList.size();j++) {
			
			System.out.println("Car "+(j+1)+" year is : "+ carList.get(j).year);
			System.out.println("Car "+(j+1)+" number of seats are "+carList.get(j).numberOfSeats);
		}
		
		
		
		
		
		
		
		
	}

}
