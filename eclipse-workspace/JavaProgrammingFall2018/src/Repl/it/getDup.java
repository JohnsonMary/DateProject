package Repl.it;
import java.util.*;

public class getDup {
	public static void main(String[] args) {
String[] str = {"2","4","5","2","2","2"};
	    
	    System.out.println(getDup(str));
		
	}
	
	
	public static int getDup(String[] r) {
		
		
		
		int count = 0;
		ArrayList list = new ArrayList();

		for (int h = 0; h < r.length; h++) {
			
			for (int f = 0; f < r.length; f++) {
				
				if (r[h].equals(r[f])) {
					count++;
				}
				
			}if(count>1) {
					list.add(r[h]);
				}count=0;
				System.out.println(list);
		}
		return list.size();

	}

	}


