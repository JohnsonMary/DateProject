package Repl.it;

public class convertC {
	public static void main(String[] args) {
		String[][] test_money =
		     {
		       {"mark","5"},
		       {"shekel","30.5"},
		     };
		     
		     String[][] test_convert=
		     {
		       {"mark","1"},
		       {"shekel","0.5"},
		     };
		     
		     double res = convertC(test_money,test_convert);
		     System.out.print(res);
		     
		   }

		
		
	
	  public static  double convertC(String[][] money,String[][] convertionRate) {
		  
		double dollars=0;
		double convert=0;
		double sum=0;
		
		for(int i=0; i<money.length;i++) {
			
			dollars=Double.parseDouble(money[i][1]);
			convert=Double.parseDouble(convertionRate[i][1]);
			sum+=dollars*convert;
			
			
		}return sum;

	
		

		  
		  
		  
	  } 


}
