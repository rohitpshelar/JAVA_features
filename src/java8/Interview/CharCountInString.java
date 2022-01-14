package java8.Interview;


public class CharCountInString {
	public static void main(String[] args) {

		String s = "rohit going to mumbai to pune";

		String temp = "";
		int count = 0;

		String removeDup = "";
		for (int i = 0; i < s.length(); i++) {

			temp = String.valueOf(s.charAt(i));

			for (int j = 0; j < s.length(); j++) {
				if (temp.equals(String.valueOf(s.charAt(j)))) {
					count++;
				}
			}
			if (!removeDup.contains(temp)) {
				if(count >1)
				System.out.println(temp + "=" + count);
			}
			count = 0;
			removeDup = removeDup.concat(temp);
		}
	}
}
