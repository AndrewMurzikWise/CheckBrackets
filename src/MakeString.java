import java.util.Random;

public class MakeString {
	public static String generateString(int stringLenght) {
		
		String brackets="";
		String [] symbol = {"[","]"};
		
		Random rn = new Random();
		
			if (stringLenght>0) {
				for (int a=0; a <stringLenght; a++) {
					brackets= brackets+symbol[rn.nextInt(2)];
					}
			}
		return brackets;
	}
}
