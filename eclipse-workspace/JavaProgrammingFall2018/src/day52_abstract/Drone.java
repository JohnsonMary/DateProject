package day52_abstract;

public class Drone implements Moveable,Flyable{
	
	int engineSize;
	int maxHeight;
	
	

	@Override
	public void move() {
        System.out.println("Move from drone");		
	}



	@Override
	public void moveIt() {
		System.out.println("Move it!");
 		
	}
	public static void main(String[] args) {
		
		Drone d1=new Drone();
		d1.move();
		d1.moveIt();
		
		
	}



	@Override
	public void fly() {
		
	}

}
