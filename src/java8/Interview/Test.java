package java8.Interview;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;



public class Test {
	
	public static void main(String[] args) {
		List<e> l = new ArrayList<>();
		Date d = new Date();
		d.setDate(27);
		d.setMonth(12);
		d.setYear(1989);
		
		Date d2 = new Date();
		d.setDate(27);
		d.setMonth(12);
		d.setYear(1991);
		
		l.add(new e(1,"Rohit",d));
		l.add(new e(2,"Rahul",d2));
		
		l = l.stream().filter(e -> e.dob.getYear() > 1990).collect(Collectors.toList());
		
		for (e e2 : l) {
			System.out.println(e2.name);
		}		
	}

}
