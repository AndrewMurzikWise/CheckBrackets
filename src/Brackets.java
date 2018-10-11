
public class Brackets {

	public static void main(String[] args) {
		
		int lenghtOfString = 4;
		String brackets = null;
		String testString = "[[][][[][]]]";
		
		brackets = MakeString.generateString(lenghtOfString);
		
		System.out.println("Random string => " + brackets);
		System.out.println("Result = " + CheckBrackets.check(brackets) + "\n");
		System.out.println("TestString => " + testString);
		System.out.println("Result for TestString = " + CheckBrackets.check(testString));
	}
}
