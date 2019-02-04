package Practic_day41;

public class GirlTester {
	public static void main(String[] args) {
		
		Girl girl1=new Girl();
		girl1.name="Lola";
		girl1.colorOfHair="Gold";
		girl1.age=21;
		girl1.weight=129;
		
		girlInfo(girl1);
		
		Girl newwGirl=newGirl("Brianna","brown",13,95);
		System.out.println(newwGirl.name);
		System.out.println(newwGirl.colorOfHair);
		System.out.println(newwGirl.age);
		
		System.out.println("-------------------------");

		girlInfo(newwGirl);
		
	}
	public static void girlInfo(Girl girlPerson) {
		
		System.out.println("Girl's name is: "+girlPerson.name);
		System.out.println("Girl's hair color is "+girlPerson.colorOfHair);
		System.out.println("Girl's age is: "+girlPerson.age);
		System.out.println("Girl's weight is: "+girlPerson.weight);
		
		
		
		
	}
	public static Girl newGirl(String name,String colorOfHair,int age,int weight) {
		
		Girl girl2=new Girl();
		
		girl2.name=name;
		girl2.colorOfHair=colorOfHair;
		girl2.age=age;
		girl2.weight=weight;

		return girl2;
		
	}

}
