package day8_conditionals2;
import java.util.Scanner;

public class ChooseLanguage {
	public static void main(String[] args) {
	
		
		System.out.println("Please select:English->1 \n"+
		                   "Spanish->2\n"+
				           "Turkish->3\n"+
		                   "Russian->4\n"+
				           "Uyghur->5\n"+
		                   "Uzbek->6\n"+
				           "Kyrgyz->7\n"+
		                   "Tajik->8");
		Scanner scan=new Scanner(System.in);
		
        int language=scan.nextInt();				
	
		String greeting="";
		
		if(language==1) {
			greeting="Hello,How are you?";
					
		}else if(language==2) {
			greeting="Como estas?";
			
		}else if (language==3) {
			greeting="Nasilsin?";
			
		}else if (language==4) {
			greeting="Kak nena?";
			
		}else if(language==5) {
			greeting="Qalaysiz?";
			
		}else if(language==6) {
			greeting="Qalaysiz";
		}else if(language==7) {
			greeting="Kahnancaih?";
			
		}else if(language==8) {
			greeting="Uymo?";
			
		}else {
			greeting="I don't speak that language";
		}	
			System.out.println(greeting);
		
		
	}

}
