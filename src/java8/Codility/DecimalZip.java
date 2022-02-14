package java8.Codility;
//The decimal zip of two non-negative integers A and B is an integer C whose decimal
//representation is created from decimal representations of A and B as follows:
//@ the first (i.e the most significant) digit of C the first digit of A;
//@ the second digit of C id the first digit of B;
//@ the third digit of C is the second digit of A;
//@ the fourth digit of C is the second digit of B;
//@ etc.
//
//If one of the integers A and B runs out of digits, the remaining digits of the other integer are
//appended to the result. The decimal representation of 0 is assumed to be &quot;0&quot;.
//For example, the decimal zip of 12 and 56 is 1526. The decimal zip of 56 and 12 is 5162. The
//decimal zip of 12345 and 678 is 16273845. The decimal zip of 123 and 67890 is 16273890.
//The decimal zip of 1234 and 0 is 10234.
public class DecimalZip {
	 public long calculateDecimalZip(int A, int B) {
		    char[] firstNumberChars = String.valueOf(A).toCharArray();
		    char[] secondNumberChars = String.valueOf(B).toCharArray();

		    int firstNumberLength = firstNumberChars.length;
		    int secondNumberLength = secondNumberChars.length;
		    int highestLength = Math.max(firstNumberLength, secondNumberLength);

		    StringBuilder decimalZip = new StringBuilder();
		    for (int i = 0; i < highestLength; i++) {
		        if (i < firstNumberLength)
		            decimalZip.append(firstNumberChars[i]);
		        if (i < secondNumberLength)
		            decimalZip.append(secondNumberChars[i]);
		    }

		    int maxValue = 100000000;
		    int answer = Integer.parseInt(String.valueOf(decimalZip));
		    if (answer > maxValue)
		        return -1;
		    return answer;
		}

}
