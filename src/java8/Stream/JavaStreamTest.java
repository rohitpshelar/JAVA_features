package java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


//Intermediate Operations:

//map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
	//List number = Arrays.asList(2,3,4,5);
	//List square = number.stream().map(x->x*x).collect(Collectors.toList());
//filter: The filter method is used to select elements as per the Predicate passed as argument.
	//List names = Arrays.asList("Reflection","Collection","Stream");
	//List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
//sorted: The sorted method is used to sort the stream.
	//List names = Arrays.asList("Reflection","Collection","Stream");
	//List result = names.stream().sorted().collect(Collectors.toList());

//Terminal Operations:

//collect: The collect method is used to return the result of the intermediate operations performed on the stream.
	//List number = Arrays.asList(2,3,4,5,3);
	//Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
//forEach: The forEach method is used to iterate through every element of the stream.
	//List number = Arrays.asList(2,3,4,5);
	//number.stream().map(x->x*x).forEach(y->System.out.println(y));
//reduce: The reduce method is used to reduce the elements of a stream to a single value.
	//The reduce method takes a BinaryOperator as a parameter.
	//List number = Arrays.asList(2,3,4,5);
	//int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

public class JavaStreamTest {
	public static void main(String[] args) {
		
		//Integer
		IntStream.range(1, 10).filter(e -> e%2==0).skip(1).forEach(e->System.out.print(e+","));
		System.out.println("=1=");
		System.out.println(IntStream.range(1, 10).sum());
		System.out.println("=2=");
		IntStream.range(1, 1000).filter(e -> e%3==0).filter(e -> e%5==0).filter(e -> e%10!=0).forEach(e -> System.out.print(e+","));
				
		//String
		System.out.println("=3=");
		System.out.println(Stream.of("Rohit","Shelar","AA").sorted().count());
		
		System.out.println("=4=");
		Stream.of("Rohit","Shelar","AA").sorted().findFirst().ifPresent(System.out::println);
		
		System.out.println("=5=");
		String[] names = {"Rohit","Shelar","AA"};
		Arrays.stream(names).filter(e->e.startsWith("S")).forEach(System.out::println);
		 
		System.out.println("=6=");
		Arrays.stream(new int[] {2,1,6,3}).map(e->e*e).average().ifPresent(System.out::println);
		
		System.out.println("=7=");
		List<String> pnames= Arrays.asList("Rohit","Shelar","AA","anna");
		pnames.stream().map(String::toLowerCase).filter(e->e.startsWith("a")).map(x -> x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase()).forEach(e -> System.out.print(e+","));
		
		System.out.println("=8=");
			//types of reverse List
			List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 3, 3, 7, 5));
			list.stream().forEach(System.out::println); // 1 3 3 7 5
	
			int size = list.size();
	
			ListIterator<Integer> it = list.listIterator(size);
			Stream.generate(it::previous).limit(size)
			    .forEach(System.out::println); // 5 7 3 3 1
	
			ListIterator<Integer> it2 = list.listIterator(size);
			Stream.iterate(it2.previous(), i -> it2.previous()).limit(size)
			    .forEach(System.out::println); // 5 7 3 3 1
	
			// If list is RandomAccess (i.e. an ArrayList)
			IntStream.range(0, size).map(i -> size - i - 1).map(list::get)
			    .forEach(System.out::println); // 5 7 3 3 1
	
			// If list is RandomAccess (i.e. an ArrayList), less efficient due to sorting
			IntStream.range(0, size).boxed().sorted(Comparator.reverseOrder())
			    .map(list::get).forEach(System.out::println); // 5 7 3 3 1
			
			// return list object
			list = list.stream().collect(Collectors.collectingAndThen(Collectors.toList(),
	                  lst -> {
	                      Collections.reverse(lst);
	                      return lst.stream();
	                  }
	              )).collect(Collectors.toList());

			for (Integer integer : list) {
				System.out.println(integer);
			}
		
	}
	

}
