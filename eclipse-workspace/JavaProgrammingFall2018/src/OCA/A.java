package OCA;

public class A extends AA {

		public static void main(String[] args) {
			A a = new A(3536); 
		}
		
		public A(int x) {
			
			System.out.println("A NO ARG ");
		}

	}

	class AA {
		public AA() {
			
		}
		public AA(int x) {
			super();
			System.out.println("AA NO ARG ");
		}
	}

	
	


