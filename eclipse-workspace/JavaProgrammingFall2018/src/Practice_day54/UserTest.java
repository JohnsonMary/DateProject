package Practice_day54;

public class UserTest {
	
	public static void main(String[] args) {
		
		RegularUser r1=new RegularUser(23,"Jack",4847);
		r1.sendmessage("Hello everyone!!");
		r1.joinAGroup(37373);
		
		AdminUser a1=new AdminUser(32,"Akbar",true);
		a1.sendmessage("I'll do it whatever it takes!!!!!!!!!!!!!!");
		a1.sendmessage("I'll be an SDET inshaAllah because Allah knows that I worked so hard,I'll not give up,never give up,"
				+ " and this is my only chance,please Oh Allah help me,help me to reach my goal,please Allah please help me,give me strength,make me strong,"
				+ "make me bellieve that I can do it,take me where I'm going to be happy with my family!...");
		r1.sendmessage("AMIN!!!");
		
		
		
	}

}
