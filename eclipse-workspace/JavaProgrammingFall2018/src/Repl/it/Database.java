package Repl.it;

public class Database {
	public static void main(String[] args) {
		
	System.out.print(lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n");
			      
	 System.out.print(
		       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
		       );	
	 System.out.print(
		       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
		       );
		
	 
	}
	
	 public static String lameDb(String db, String op,String id,String data)
	  {
		 
		 String dbArray[]=db.split("#");
		 String all="";
		 
		 switch (op) {
		 case "add":
			 return db+"#"+id+data;
		 case "edit":
			 for(int i=0; i<dbArray.length;i++) {
				 
				 
				 if(dbArray[i].contains(id)) {
					 dbArray[i]="#"+id+data+"#";
				 }
				 all+=dbArray[i];
					 
			 }return all;
			
		 case "delete":
             for(int j=0; j<dbArray.length;j++) {
				 
			if(dbArray[j].contains(id)) {
				 
				 }
			 all+=dbArray[j];

	        }return all;
			
			

		 case "none":
			 return db; 
			 
	  }return "";			 
	   }
 
}
		 
	 
	 
