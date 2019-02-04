package Practice_Repl_it;

public class clean {
	
	
	public static void extractNum(String str) {
		
	String all="";
	
		for(int j=0; j<str.length();j++) {
			
		    for(char i='0';i<='9';i++) {
			
			if(str.charAt(j)==i) {
				
				all+=str.charAt(j);
				
			}
		}	
	}System.out.println(all);
		
	}

}
