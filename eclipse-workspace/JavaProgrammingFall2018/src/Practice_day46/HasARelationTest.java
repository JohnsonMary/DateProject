package Practice_day46;

public class HasARelationTest {
	public static void main(String[] args) {
		
		Engine carEngine=new Engine();
		carEngine.cylinders=4;
		carEngine.horsePower=10;
		
		Car car1=new Car();
		car1.model="BMW";
		
		car1.engine=new Engine();
		car1.engine.horsePower=200;
		System.out.println(car1.engine.horsePower);
		
		Car car2=new Car();
		car2.engine=new Engine(45,20);
		System.out.println(car2.engine.cylinders);
		System.out.println(car2.engine.horsePower);
		
		
		
		
		
		
	}

}
