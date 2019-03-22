package work;

public class LogicalOperatorsAndPrecedence {

	public static void main(String[] args) {
		
		boolean b = false;
		
		int x = 0;
		
		//false 
		System.out.println(b && (x == 0));
		
		//true
		System.out.println(b || (x == 0));
		
		//true
		System.out.println(!b && (x == 0));
		
		//true
		System.out.println(!b || (x == 0));
		
		//false
		System.out.println(b && (x !=0));
		
		//false
		System.out.println(b || (x !=0));
		
		//false
		System.out.println(!b && (x !=0));
		
		//true
		System.out.println(!b || (x !=0));
	}
}
