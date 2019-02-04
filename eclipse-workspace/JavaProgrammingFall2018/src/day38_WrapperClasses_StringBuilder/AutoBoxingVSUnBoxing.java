package day38_WrapperClasses_StringBuilder;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingVSUnBoxing {
	public static void main(String[] args) {
		
		int i = 1000;
		Integer j = i;
		
		Double d = 34.2;
		
		boolean b = true;
		Boolean b2 = b;
		
		List<Integer> nums = new ArrayList<>();
		nums.add(433);
		
		int p = 555;
		nums.add(p);
		nums.add(new Integer(77));
		
		System.out.println(nums);
		
		int r = nums.get(0);
		
		Boolean bool = new Boolean (false);
		boolean bl=bool;
		System.out.println(bl);
		
		Character chObj='^';
		char chPrim = chObj;
		
		System.out.println(chPrim);
		
		
		
		
		
	}
	

}
