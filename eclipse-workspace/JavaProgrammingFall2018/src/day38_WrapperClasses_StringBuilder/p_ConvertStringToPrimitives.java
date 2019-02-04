package day38_WrapperClasses_StringBuilder;

import java.util.ArrayList;

public class p_ConvertStringToPrimitives {
	public static void main(String[] args) {
		
		String count="432";
	    int iCount=Integer.parseInt(count);
	    System.out.println(iCount);
		
		Integer iCount2= Integer.valueOf(count);
		System.out.println(count);
		
		String num="234";
		
		int num1=Integer.valueOf(num);
		Integer num2=Integer.valueOf(num);
		
		String str="Price is 45.77";
		
		String str1[]=str.split(" ");
		
		double intStr=Double.parseDouble(str1[2]);
		System.out.println(intStr);
		
		String etsyResult = "“wooden spoon” (13,950 Results)";
		
		String sp[]=etsyResult.split(" ");
		String woodenSpoon=(sp[2]).replace("(","").replace(",","");
		System.out.println(woodenSpoon);
		
		Integer ws=Integer.parseInt(woodenSpoon);
		System.out.println(ws);
		
		String[] sNums= {"234","43","22","12"};
		ArrayList<Integer> listNums=new ArrayList<>();
		
		for(String s:sNums) {
			
			listNums.add(Integer.valueOf(s));
			
		}System.out.println(listNums);
		

		
	}

}
