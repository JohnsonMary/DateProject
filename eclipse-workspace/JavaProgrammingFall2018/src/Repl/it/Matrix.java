package Repl.it;
import java.util.*;

public class Matrix {
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		    int rows = inp.nextInt(), cols = inp.nextInt();
		    String[][] arr = new String[rows][cols];
		    for(int i=0 ;i<=rows-1;i++)
		    {
		      for(int j=0 ;j<=cols-1;j++)
		      {
		        arr[i][j]=inp.next();
		        
		        if(j%2==0) {
		        	arr[i][j]="0";
		        }else if(j%2==1) {
		        	arr[i][j]="1";
		        	
		        }

		      }
		    }System.out.println( Arrays.deepToString(arr));
		    
	}

	
}
