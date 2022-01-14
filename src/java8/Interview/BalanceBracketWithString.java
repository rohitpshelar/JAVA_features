package java8.Interview;

public class BalanceBracketWithString {

	// Driver code
	public static void main(String[] args) {
		String expr = "{[]{}}";

		// Function call
		if (areBracketsBalanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}

	// function to check if brackets are balanced
	static boolean areBracketsBalanced(String expr) {
		String exp = "";
		for (int i = 0; i < expr.length(); i++) {
			char c = expr.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				exp = exp + String.valueOf(c);

			} else if (c == ')' || c == '}' || c == ']') {
				if(c == '}' ) {
					c = '{';
				}
				if(c == ')' ) {
					c = '(';
				}
				if(c == ']' ) {
					c = '[';
				}
				if (exp.length() > 0 && exp.charAt(exp.length() - 1) == c) {
					exp = exp.substring(0, exp.length() - 1);
				}else 
					return false;

			} else {
				return false;
			}
		}
		if (exp.isEmpty())
			return true;
		else
			return false;
	}
}
