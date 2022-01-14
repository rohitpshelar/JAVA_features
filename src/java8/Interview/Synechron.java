package java8.Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Synechron {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(2);
		l.add(1);
		l.add(3);

		// for
		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
				Integer temp = l.get(i);
				l.set(i, l.get(j));
				l.set(j, temp);
			}
		}

		for (Integer integer : l) {
			System.out.println(integer);
		}
		
		//Stream
		  l.stream().collect(Collectors.collectingAndThen(Collectors.toList(),
		              lst -> {
		                  Collections.reverse(lst);
		                  return lst.stream();
		              }
		          )).forEach(System.out::println);
		  
		  // return list object
		  l = l.stream().collect(Collectors.collectingAndThen(Collectors.toList(),
		          lst -> {
		              Collections.reverse(lst);
		              return lst.stream();
		          }
		      )).collect(Collectors.toList());
		
		  for (Integer integer : l) {
			  System.out.println(integer);
		  }
		 
		 //Iterator
		System.out.println("Iterator");
		 ListIterator<Integer> li = l.listIterator(l.size());

		// Iterate in reverse.
		while(li.hasPrevious()) {
		  System.out.println(li.previous());
		}
		
		while(li.hasPrevious()) {
			  System.out.println(li.previous());
			}
	}
}
