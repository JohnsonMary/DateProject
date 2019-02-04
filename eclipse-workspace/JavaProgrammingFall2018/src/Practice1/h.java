package Practice1;
import java.util.*;

public class h {
		
		 public static void main(String[] args) {
				Scanner inp=new Scanner(System.in);
				System.out.println("size");
				int size=inp.nextInt();
				
				int[] arr = new int[size];
				for(int a:arr) {
					
					System.out.println("array");
					 a=inp.nextInt();
					
				}
				
				
				plus_minus(arr);
				
			    	
			}
			
			public static void plus_minus(int[] ints) {
				
		      		
					
				int pcounter=0;
				int ncounter=0;
				int zcounter=0;
				
				
				
			   	for(int i=0; i<=ints.length-1; i++) {
					
					if(ints[i]>0) {
						pcounter++;
						
					}else if(ints[i]<0) {
						ncounter++;
						
						
					}else if(ints[i]==0) {
						zcounter++;
						
						
					}

			   	}   
				
				
					System.out.print("positives: "+pcounter+",");
					System.out.print(" negatives: "+ncounter+",");
					System.out.println(" zeros: "+zcounter);
		        
			}
			
		}




		
		
		
		
		
		

