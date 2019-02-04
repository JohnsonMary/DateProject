package Practice2;
import java.util.Scanner;

public class chooseALanguage {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please select number:\n"+
		                                  "1.English\n"+
				                          "2.Turkish\n"+
				                          "3.Russian\n"+
				                          "4.Arabic\n"+
				                          "5.Uzbek\n"+
				                          "6.Tajik\n"+
				                          "7.Spanish\n");
		System.out.println("Enter the number please");
		int num=scan.nextInt();
		String welcome="";
		
		if(num==1) {
			welcome="Hello,how are you?";
			
		}else if(num==2) {
			welcome="Merhaba,nasilsin?";
			
		}else if(num==3) {
			welcome="Привет как дела?";
		
		}else if(num==4) {
			welcome="مرحبا كيف حالك؟";
			
		}else if(num==5) {
			welcome="Salom qaleysan?";
			
		}else if(num==6) {
			welcome="Салом, шумо чӣ хел?";
			
					
		}else if (num==7) {
			welcome="¿Hola como estas?";
			
		}else {
            welcome="I do not speak that language";
		}
		System.out.println(welcome);
		
		
		
	}

}
