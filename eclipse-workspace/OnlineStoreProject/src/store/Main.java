package store;

public class Main {
	public static void main(String[] args) {
			
		 String[] SPECIAL_ITEMS = {"Cactus", "Fork" , "T Shirt"};

	String order[]={"dog", "cactus", "cactus", "cactus", "coffee mug"};

	System.out.println(buyThreeDiscount(order,true));


	}
	
	
	public static String[] buyThreeDiscount(String[] order, boolean isMember) {
		
	 String[] SPECIAL_ITEMS = {"Cactus", "Fork" , "T Shirt"};


	String sameItem="";
	int item=0;
	
	
	for(int i=0;i<order.length;i++) {
		for(int j=0;j<SPECIAL_ITEMS.length;j++) {
			
			if(order[i].contains(SPECIAL_ITEMS[j])) {
			    item++;
			    sameItem=order[i];
			}

			
		}
		
	}
	if(isMember && item==3) {
		
		order[order.length]=sameItem;
		order[order.length+1]=sameItem;
		return order;
		
		
	}else if(!isMember && item==3) {

		order[order.length]=sameItem;
		return order;
		
	}else if(item==0){	
		
		
		
	}return order;
}
}