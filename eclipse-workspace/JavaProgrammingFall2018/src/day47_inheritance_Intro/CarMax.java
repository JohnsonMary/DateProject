package day47_inheritance_Intro;

public class CarMax {
	public static void main(String[] args) {
		
		//create object of Vehicle class
				//instantiation of Vehicle class
				Vehicle vehicle = new Vehicle();
				vehicle.makeAndModel = "Subaru Outback";
				vehicle.year = 2018;
				vehicle.maxSpeed = 140;
				vehicle.mileage=230;
				
				vehicle.drive();
				vehicle.stop();
				/* Will not work since horsePower and doUber is 
				 * in child class
				vehicle.hoursePower = 123;
				vehicle.doUber();
				*/
				//========Instantiate Car class.
				Car car = new Car();
				car.makeAndModel = "Toyota Prius";
				car.year = 2015;
				car.maxSpeed = 120;
				
				
				car.drive();
				car.stop();
				car.doUber();
				
				System.out.println("====TRAIN====");
				
				Train train = new Train();
				train.makeAndModel = "CyberTrain 10";
				train.year = 2019;
				train.maxSpeed = 200;
				train.ticketPrice = 120.50;
				
				train.drive();
				train.leaveStation();
				train.stop();
				
				
				System.out.println("======Electric Car=====");
				ElectricCar electricCar=new ElectricCar();
				electricCar.charge();
				electricCar.hasBattery=true;
				electricCar.mileage=200;
				electricCar.makeAndModel="Tesla Model-S";
				electricCar.year=2015;
				
				Car.service();
				electricCar.service();
				Vehicle.service();
				Car.service();
				Train.service();
				train.service();
				car.service();
				
				System.out.println("My  car's mileage is  "+electricCar.mileage+" .It has battery? "+electricCar.hasBattery);
				
				
				
				
				
				
				
				
			}
		}

