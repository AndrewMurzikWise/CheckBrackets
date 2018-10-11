import java.util.ArrayDeque;
import java.util.Deque;

public class CheckBrackets {

	public static boolean check(String forCheck) {
		
		boolean rezult1 = true;//"OK";
		boolean rezult2 = false;//"NOT OK";
		
		Deque<String> stack = new ArrayDeque<String>(64);
		char [] brackets = forCheck.toCharArray();

		if (forCheck.equals("")) {
			return rezult1; 
		} else if ((forCheck.length())%2>0) {
					return rezult2;
		} else if (brackets[0]==']'||brackets[brackets.length-1]=='[') {
					return rezult2;
		}
										 
		for (int a=0; a<brackets.length; a++) {
			
			String temp = Character.toString(brackets[a]); 	
			
			if (temp.equals("[")) {
				stack.push(temp); 
//				System.out.println("Stack =>"+a + stack);
			} 
			
			if (temp.equals("]")) {
				try {
					if (!stack.isEmpty()) {
						stack.pop();
//						System.out.println("Stack - =>"+a + stack);
					} else {
						System.out.println("Error in expression. Case 1");
						return rezult2;
					}
				} catch (NullPointerException e) { 
						System.out.println("Error in expression. Case 2");
						return rezult2;
				} 	
			}
			
			if (!stack.isEmpty() & a==(brackets.length-1)) {
				System.out.println("Error in expression. Case 3");
				return rezult2;
			}
		}		
		
		return rezult1;
	}
	
}
