package HomeWork;

public class Bionary2 {
	public static void main(String[] args) {
		
		int binary[]= {0, 1, 1, 0, 0, 0, 1, 1};
		int ones=0;
		int sum=0;
		
		
		
		for(int i=0; i<binary.length; i++) {
			
			if(binary[i]==1) {
				
			    ones=i;		 
			
		
	       switch (ones) {
           case 0:
        	   sum=sum+128;
        	   break;
           case 1:
        	   sum+=64;
        	   break;
           case 2:
        	   sum+=32;
        	   break;
           case 3:
        	   sum+=16;
        	   break;
           case 4:
        	   sum+=8;
        	   break;
           case 5:
        	   sum+=4;
        	   break;
           case 6:
        	   sum+=2;
        	   break;
           case 7:
        	   sum+=1;
        	   break;
           default:
               break;
	       
        	   
      }
			}	
		}	System.out.println(sum);

		
		
		
	}

}
