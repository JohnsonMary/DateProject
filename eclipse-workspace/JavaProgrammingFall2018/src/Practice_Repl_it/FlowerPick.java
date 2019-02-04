package Practice_Repl_it;

public class FlowerPick {
	public static void main(String[] args) {
		
		Flower f1=new Flower();
		
		f1.setName("Rose");
		f1.setColor("Red");
		f1.setHowMany(3);

		Flower f2=new Flower("Tulip","Yellow",8);
		
		System.out.println(f2.getName());
		System.out.println(f2.getColor());
		
		System.out.println(f1.getName()+"|"+f1.getColor()+"|"+f1.getHowMany());
		
		Flower f3=new Flower();
		System.out.println(f3.getColor());
		
		
		
		
	}

}
