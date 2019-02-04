package day16_reviewSession;

public class BooleanWithAndWithoutIf {
	public static void main(String[] args) {
		
		/*
		 * <'<='>'>='!='==
		 * &&,||,!,
		 */
		
		boolean b=12>10;
		System.out.println(b);
		b=12>10 && 10<15;
		System.out.println(!!b);
		b=!b;
		System.out.println(b);
		
		int zipCode=22102;
		
		if(zipCode>=22100 && zipCode<=22200) {
			System.out.println("Mclean");
			
		}else {
			System.out.println("Not Mclean");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
