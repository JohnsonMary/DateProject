package PtacticeD_day_34;

public class CountTimes {
	public static void main(String[] args) {
		
		System.out.println(countTimes("zzzznem","z"));
	}

	public static int countTimes(String str1,String str2) {
		
		int counter=0;
		
		for(int i=0; i<str1.length();i++) {
			
			if(str1.substring(i,i+1).equalsIgnoreCase(str2.substring(0))) {
				counter++;
				
			}
			
		}return counter;
		
	}
}
