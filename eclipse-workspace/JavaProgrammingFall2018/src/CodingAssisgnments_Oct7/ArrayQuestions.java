package CodingAssisgnments_Oct7;
import java.util.Scanner;

import java.util.Arrays;

import Practice3.New;

public class ArrayQuestions {
	public static void main(String[] args) {
		
		int sum=0;
		int [] numbers= {3,7,5,2,4};
			
		int[] a= new int[] {4,5,6};
		int[] b= new int[]{3,8,9,4};
	    
	    
	    String[] s_r=new String[] {"foo","hello","bar","world"};
	    System.out.println(s_r[0]+" "+s_r[2]);
	    
	    double [] d_r=new double[] {0.2,0.3,1.0,1.5,2.0};
   
        	System.out.print(d_r[2]+d_r[3]);
        	
        int [] nums =new int[] {5,4,3,7,8,11};
        
        for(int n:nums) {
        	System.out.println(n);
        	
        }
        
        int[] num=new int [] {6,7,11,12,2,3};
        
        for(int numb:num) {
        	sum+=numb;
        	
        	
        }System.out.print("The sum is "+sum+"\n");
	    
	    int []number=new int[] {60,73,9,15,200,350};
	    int biggest=number[0];
	    
	    for(int c:number) {
	    
	    	if(c>biggest) {
	    		biggest=c;
	    		
	    	}
	    	
	    }System.out.println("The biggest number is "+biggest);

  String[] list = new String[]   
  {"banana","apple","pinapple","banana","mango","banana"};
  
 
 int count=0;
 
     for(int i=0; i<list.length; i++) {
    	 
    	 if(list[i]=="banana") {
    		 count++;
    		 
    	 }
    	 
     }System.out.println("There are "+count+" bananas \n");
    	 
     String[] old_r = new String[] {"one","two","three"};
    		
             String new_word ="four";
    		 String[] new_r = new String[old_r.length+1];
     
    		 for(int k=0; k<old_r.length; k++) {
    			
    			 new_r[k]=old_r[k];
    			
    			 System.out.print(new_r[k]+","); 
    		
    		    }System.out.println();
               
    		    new_r[new_r.length-1]=new_word;
                
                System.out.println(Arrays.toString(new_r));
                   
                
      System.out.println("--Task 10--");  
      
      Scanner scan=new Scanner(System.in);
      System.out.println("Please enter the year");
      int year=scan.nextInt();
      int c=0;
      
      int[] growth= new int [] {-1,0,1,2,1,0,2,0,2,1};
      
      c=growth.length;
    		  for(int n :growth) {
    			  
    			  
    		  }
    	for(int h=1; h<=9; h++) {
		
    		if(year<=3 && growth[h]<1) {
    			
    			growth[h]=1;
    			System.out.print(Arrays.toString(growth));
    		
    		}else if(year>3){
    		
    			
    		}
    				
    				
    				
    			  
    		  }
      
      
     		 
    		 
    		 
    	 
     
	    
		
		
		
		
		
		
	}

}
