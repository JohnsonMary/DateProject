package day38_WrapperClasses_StringBuilder;

public class P_CreatingWrapperClasses {
	public static void main(String[] args) {
		
		Integer n1=new Integer(100);
		System.out.println(n1);
		
		Integer n2=Integer.valueOf(345);
		System.out.println(n1+n2);
		
		Integer n3=Integer.parseInt("230");
		
		Double d1=new Double(300.3);
		Double d2=Double.valueOf(250);
		Double d3=Double.parseDouble("45.2");
		System.out.println(d1+","+d2+","+d3);
		
		Character ch1=new Character('c');
		Character ch2=Character.valueOf('v');
		System.out.println(ch1+" "+ch2);
		
		System.out.println(Character.isDigit(ch1));
		System.out.println(Character.isAlphabetic(ch2));
		
		
		
		
		
		
		
	}

}
