package Practice_39;

import java.util.Arrays;

public class arrayToSb {
	public static void main(String[] args) {

		  String [] words=new String[5];
		  words[0]="coffee";
		  words[1]="tea";
		  words[2]="water";
		  words[3]="juice";
		  words[4]="milk";
		  
		  
		  StringBuilder wordsStb=new StringBuilder();
		  
		  wordsStb.append(words[0]);
		  wordsStb.append(words[1]);
		  wordsStb.append(words[2]);
		  wordsStb.append(words[3]);
		  wordsStb.append(words[4]);

		  
		
		
	}
	  public static StringBuilder  arrayToSb(String[] r) {
		 StringBuilder sb=new StringBuilder();
		  
		  for(int i=0;i<r.length;i++) {
			  
			 sb.append(r[i]); 
			  
		  }return sb;

	  }
}
