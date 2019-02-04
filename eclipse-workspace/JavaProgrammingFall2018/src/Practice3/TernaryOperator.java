package Practice3;

public class TernaryOperator {
	public static void main(String[] args) {
		int score=78;
		String status;
		
		if(score>=60) {
			status="Passed";
			
		}else {
			status="Failed";
		}
		System.out.println(status);
		
		
		status=(score>=60)?"passed":"failed";
		
		System.out.println(status);
		
		boolean express=false;
		int shipping;
		
		shipping=(express)? 25:15;
		System.out.println(shipping);
		
		shipping=(express==true)? 25:15;
		
		express=false;
		System.out.println((express)? 25:15);
		
		
	}

}
