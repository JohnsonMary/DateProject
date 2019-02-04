package draw;

import java.awt.Color;

import grid.Grid;

public class PracticeDraw {

	public static void main(String[] args) {
		
		
		Grid grid = new Grid(10);
		System.out.println("Grid Height is : " + grid.getHt());
		System.out.println("Grid Width is : " + grid.getWd());
		
		grid.setColor(0,0,Color.RED); 
		grid.setColor(1,0,Color.RED); 
		grid.setColor(2,0,Color.RED); 
		grid.setColor(3,0,Color.RED); 
		
		for(int i=0; i<grid.getHt();i++) {
			
			grid.setColor(i, 0, Color.RED);
		}
		for(int i=0; i<grid.getWd();i++) {
			
			grid.setColor(0, i, Color.RED);
			
			
		}
		
		for(int i=0; i<grid.getHt();i++) {
			
			grid.setColor(i, grid.getWd()-1, Color.RED);
			
		}
        for(int i=1; i<grid.getWd();i++) {
			
			grid.setColor(grid.getHt()-1, i, Color.RED);
			
		}
		
		
		
        Grid grid1 = new Grid(10);
		System.out.println("Grid Height is : " + grid1.getHt());
		System.out.println("Grid Width is : " + grid1.getWd());
		
		
		for(int i=0; i<grid1.getHt();i++) {
			
			grid1.setColor(i, 0, Color.BLUE);
			
			
			
		}
		

		 




		



	}

}
