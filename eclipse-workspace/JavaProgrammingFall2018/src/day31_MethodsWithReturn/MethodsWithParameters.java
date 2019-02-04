package day31_MethodsWithReturn;

public class MethodsWithParameters {
	public static void main(String[] args) {
		
		String newEmail=buildEmail("Mike","Smith");
		System.out.println(newEmail);
		
		System.out.println(buildEmail("John","Doe").toLowerCase());
		
	
		System.out.println(getMax(100,3));
		int myNum=getMax(200,350);
		System.out.println(myNum);
		
		System.out.println(getMax3(23,44,2));
		int getLargest=getMax3(0,65,1);
		System.out.println(getLargest);
		
	}

	public static String buildEmail(String firstName,String lastName)  {
		
		String email=firstName.toLowerCase()+"_"+lastName.toLowerCase()+"@gmail.com";
		return email;
		
		
		
		
		
		
	}
	public static int getMax (int num1,int num2) {
		
		int largest=0;
		
		if(num1>num2) {
			largest=num1;
		}else  {
			largest=num2;
		}

		return largest;
		
		

		
		
	}

	public static int getMax3(int num1,int num2,int num3) {
		
		int largest=0;
		
		if(num1>num2 && num1>num3) {
			largest=num1;
			
		}
		else if(num2>num1 && num2>num3) {
			largest=num2;
			
		}else {
			largest=num3;
		}
		return largest;


	}
	
}
