
public class FetchCapitalChar {
	public static void main(String[] args) {
		
		String input = "RoHiT";

		String secondinput = "rohIT sHeLar";
		String rsecondinput = "";
		char ch;
		String third = "";
		//1 left to right 	
		//2 nd right to left
		// 3 pick capital  - if char is cap case then the store in 3rd String var, after continue same string with next char
		// 4 if char is small case switch the string , start counting char from where you left 
		// 5 
		
		for (int i = 0; i < secondinput.length(); i++) {
			ch = secondinput.charAt(i);
			rsecondinput = ch+rsecondinput;
			
		}
		System.out.println(rsecondinput);
		
		int session = 1;
		
		for (int i = 0; i < input.length(); i++) {
			if(Character.isUpperCase(input.charAt(i))) {
				third = third.concat(String.valueOf(input.charAt(i)));
			}else {
				for (int j = session; j < rsecondinput.length(); j++) {
					//j = session;
					if(Character.isUpperCase(rsecondinput.charAt(session))) {
						
						third = third.concat(String.valueOf(rsecondinput.charAt(session)));
						session = session + 1;
					}else {
						session = session + 1;
						//System.out.println(session);
					//	if(i<input.length()) {
							//continue
					//	}else {
							break;
					//	}
						
					}
				}
			}
			
			
		}
		System.out.println(third);
		
		
	}
}
