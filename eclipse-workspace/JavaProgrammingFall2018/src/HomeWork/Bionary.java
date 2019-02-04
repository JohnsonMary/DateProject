package HomeWork;

public class Bionary {
	public static void main(String[] args) {
		
		int binary[]= {0, 0, 0, 0, 0, 0, 1, 1};
		int ones=0;
		int sum=0;
		
		
		
		for(int i=0; i<binary.length; i++) {
			
			if(binary[i]==1) {
				ones=i;
			}
	  }
		
		
		
		
           switch (ones) {
           case 0:
        	   sum=sum+128;
           case 1:
        	   sum+=64;
           case 2:
        	   sum+=32;
           case 3:
        	   sum+=16;
           case 4:
        	   sum+=8;
           case 5:
        	   sum+=4;
           case 6:
        	   sum+=2;
           case 7:
        	   sum+=1;
           default:
        
        	   
        	   
      }System.out.println(sum);

		
		
		
		
		
	}

}
