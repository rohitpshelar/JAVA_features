package java8.Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test2 {

	
	private  static void old() {
		List<Integer> l = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			l.add(i);
		}

		// find j
		while (l.size() > 1) {
			for (int i = 0; i < l.size(); i++) {

				if (l.size() % 2 != 0) {
					Collections.reverse(l);
					if (i % 2 != 0) {
						l.remove(i);
					}
				} else if (i % 2 != 0) {
					Collections.reverse(l);
					l.remove(i);
				}
			}
		}

		for (Integer integer : l) {
			System.out.println(integer);
		}

	}
	
	private static void newMethod() {
		List<Integer> l = IntStream.range(1,42).boxed().collect(Collectors.toList());
	//	System.out.println(l.(1));
		while(l.size()>1) {
			l.stream().forEach(i->{
				if (l.size() % 2 != 0) {
					Collections.reverse(l);
					if (l.indexOf(i)%2+1 != 0) {
						l.remove(i);
					}
				} else if (l.indexOf(i)+1 % 2 != 0) {
					Collections.reverse(l);
					l.remove(i);
				}
			});
		}
		
		for (Integer integer : l) {
			System.out.println(integer);
		}

	}
	
	public static void main(String[] args) {
		
		
		//newMethod();
		old();
		

	}

}
