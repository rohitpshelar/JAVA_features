package java8.Codility;

import java.util.*;
import java.util.stream.Collectors;

public class distinctValue {
    public int solution(int[] A) {
        List<Integer> s = Arrays.stream(A).boxed().collect(Collectors.toList());
        return s.size();
    }
    
    
}
