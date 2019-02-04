package day40CustomClasses;

public class MovieTester {
	public static void main(String[] args) {
		
		Movie m1=new Movie();
		
		m1.name="Asi";
		m1.length=75;
		
		Movie m2=new Movie();
		m2.name="Mission Impossible";
		m2.length=110;
		
		Movie m3=new Movie();
		m3.name="Jurassic Park";
		m3.length=100;
		
		m1.watch();
		m2.watch();
		m3.watch();
		
		m1.buy(13.67);
		m2.buy(16.29);
		m3.buy(23.0);
		
		
		m1.sell(10.6);
		m2.sell(13.1);
		m3.sell(19.9);
		
		
		
	}

}
