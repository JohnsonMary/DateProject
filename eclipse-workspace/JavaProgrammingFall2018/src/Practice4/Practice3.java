package Practice4;

public class Practice3 {
	public static void main(String[] args) {
		
		String alp="ABCDEFGHIJKLMNOPQRSTEUVWXYZ";
		String email="pinarercans@gmail.com";
		
		System.out.println(alp.indexOf("J"));
		System.out.println(alp.charAt(13));
		System.out.println(alp.endsWith("Z"));
		System.out.println(alp.lastIndexOf("E"));
		
		System.out.println(email.contains("gmail"));
		System.out.println(alp.indexOf("R"));
		System.out.println(alp.substring(17));
		
		System.out.println(alp.indexOf("Z"));
		System.out.println(alp.substring(17,27));
		System.out.println(email.length());
		
		System.out.println(alp.indexOf("S",15));
		System.out.println(email.toUpperCase());
		System.out.println(alp.toLowerCase());
		
		System.out.println(email.indexOf("@"));
		System.out.println(email.indexOf("m",11));
		System.out.println(email.lastIndexOf("m"));
		
		
		
		
		
		
		
		
		
		
	}
	
}
