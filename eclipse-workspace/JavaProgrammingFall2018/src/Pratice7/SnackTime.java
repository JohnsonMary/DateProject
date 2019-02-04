package Pratice7;

public class SnackTime {
	public static void main(String[] args) throws InterruptedException {
		
		boolean hungry=true;
		int apples=1;
		
		while(hungry) {
			System.out.println("Eating an apple");
			
			if(apples==5) {
				hungry=false;
				
			}apples++;
			
		}
		
		int num=1;
		
		while(num<=10) {
			System.out.print(num+",");
			num++;
			Thread.sleep(1000);
			
		}
		
		
	}

}
