import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfIntList {
	
	static int j = 0;
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(10);
	        list.add(20);
	        list.add(30);	
	        list.add(40);
	        list.add(50);
	        
	        
	System.out.println(sum(list));
}

static int sum(List<Integer> list) {
	
	
	list.stream().map(e-> j = j+e).collect(Collectors.toList());
	
	return j;
}
}
